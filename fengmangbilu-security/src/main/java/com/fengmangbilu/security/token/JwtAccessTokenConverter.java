package com.fengmangbilu.security.token;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.InvalidSignatureException;
import org.springframework.security.jwt.crypto.sign.MacSigner;
import org.springframework.security.jwt.crypto.sign.RsaSigner;
import org.springframework.security.jwt.crypto.sign.RsaVerifier;
import org.springframework.security.jwt.crypto.sign.SignatureVerifier;
import org.springframework.security.jwt.crypto.sign.Signer;
import org.springframework.util.Assert;

import com.alibaba.fastjson.JSON;
import com.fengmangbilu.security.AccessToken;
import com.fengmangbilu.security.DefaultAccessToken;
import com.fengmangbilu.security.DefaultRefreshToken;
import com.fengmangbilu.security.RefreshToken;
import com.fengmangbilu.security.exceptions.InvalidTokenException;

public class JwtAccessTokenConverter implements TokenEnhancer, AccessTokenConverter, InitializingBean {

	private AccessTokenConverter tokenConverter = new DefaultAccessTokenConverter();

	private String verifierKey = "eGVkZp";

	private Signer signer = new MacSigner(verifierKey);

	private String signingKey = verifierKey;

	private SignatureVerifier verifier;

	public void setAccessTokenConverter(AccessTokenConverter tokenConverter) {
		this.tokenConverter = tokenConverter;
	}

	public AccessTokenConverter getAccessTokenConverter() {
		return tokenConverter;
	}

	@Override
	public Map<String, ?> convertAccessToken(AccessToken token, Authentication authentication) {
		return tokenConverter.convertAccessToken(token, authentication);
	}

	@Override
	public AccessToken extractAccessToken(String value, Map<String, ?> map) {
		return tokenConverter.extractAccessToken(value, map);
	}

	@Override
	public UsernamePasswordAuthenticationToken extractAuthentication(Map<String, ?> map) {
		return tokenConverter.extractAuthentication(map);
	}

	public void setVerifier(SignatureVerifier verifier) {
		this.verifier = verifier;
	}

	public void setSigner(Signer signer) {
		this.signer = signer;
	}

	public Map<String, String> getKey() {
		Map<String, String> result = new LinkedHashMap<String, String>();
		result.put("alg", signer.algorithm());
		result.put("value", verifierKey);
		return result;
	}

	public void setKeyPair(KeyPair keyPair) {
		PrivateKey privateKey = keyPair.getPrivate();
		Assert.state(privateKey instanceof RSAPrivateKey, "KeyPair must be an RSA ");
		signer = new RsaSigner((RSAPrivateKey) privateKey);
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		verifier = new RsaVerifier(publicKey);
		verifierKey = "-----BEGIN PUBLIC KEY-----\n" + new String(Base64.encode(publicKey.getEncoded()))
				+ "\n-----END PUBLIC KEY-----";
	}

	public void setSigningKey(String key) {
		Assert.hasText(key, "key must not empty");
		key = key.trim();

		this.signingKey = key;

		if (isPublic(key)) {
			signer = new RsaSigner(key);
		} else {
			// Assume it's a MAC key
			this.verifierKey = key;
			signer = new MacSigner(key);
		}
	}

	private boolean isPublic(String key) {
		return key.startsWith("-----BEGIN");
	}

	public boolean isPublic() {
		return signer instanceof RsaSigner;
	}

	public void setVerifierKey(String key) {
		this.verifierKey = key;
	}

	public AccessToken enhance(AccessToken accessToken, Authentication authentication) {
		DefaultAccessToken result = new DefaultAccessToken(accessToken);
		result.setJti(result.getToken());
		result.setToken(encode(result, authentication));
		RefreshToken refreshToken = result.getRefreshToken();
		if (refreshToken != null) {
			DefaultAccessToken encodedRefreshToken = new DefaultAccessToken(accessToken);
			encodedRefreshToken.setJti(result.getJti());
			encodedRefreshToken.setAti(refreshToken.getValue());
			encodedRefreshToken.setExpiration(null);
			DefaultRefreshToken token = new DefaultRefreshToken(encode(encodedRefreshToken, authentication));
			if (refreshToken instanceof DefaultExpiringRefreshToken) {
				Date expiration = ((DefaultExpiringRefreshToken) refreshToken).getExpiration();
				encodedRefreshToken.setExpiration(expiration);
				token = new DefaultExpiringRefreshToken(encode(encodedRefreshToken, authentication), expiration);
			}
			result.setRefreshToken(token);
		}
		return result;
	}

	public boolean isRefreshToken(AccessToken token) {
		return token.getAti() != null;
	}

	protected String encode(AccessToken accessToken, Authentication authentication) {
		String content;
		try {
			content = JSON.toJSONString(tokenConverter.convertAccessToken(accessToken, authentication));
		} catch (Exception e) {
			throw new IllegalStateException("Cannot convert access token to JSON", e);
		}
		String token = JwtHelper.encode(content, signer).getEncoded();
		return token;
	}

	protected Map<String, Object> decode(String token) {
		try {
			Jwt jwt = JwtHelper.decodeAndVerify(token, verifier);
			String content = jwt.getClaims();
			Map<String, Object> claims = JSON.parseObject(content);
			if (claims.containsKey(EXP) && claims.get(EXP) instanceof Integer) {
				Integer intValue = (Integer) claims.get(EXP);
				claims.put(EXP, new Long(intValue));
			}
			return claims;
		} catch (Exception e) {
			throw new InvalidTokenException("Invalid access token");
		}
	}

	public void afterPropertiesSet() throws Exception {
		if (verifier != null) {
			// Assume signer also set independently if needed
			return;
		}
		SignatureVerifier verifier = new MacSigner(verifierKey);
		try {
			verifier = new RsaVerifier(verifierKey);
		} catch (Exception e) {
			//Unable to create an RSA verifier from verifierKey (ignoreable if using MAC)
		}
		// Check the signing and verification keys match
		if (signer instanceof RsaSigner) {
			byte[] test = "test".getBytes();
			try {
				//Signing and verification RSA keys match
				verifier.verify(test, signer.sign(test));
			} catch (InvalidSignatureException e) {
				//Signing and verification RSA keys do not match
			}
		} else if (verifier instanceof MacSigner) {
			// Avoid a race condition where setters are called in the wrong
			// order. Use of
			// == is intentional.
			Assert.state(this.signingKey == this.verifierKey,
					"For MAC signing you do not need to specify the verifier key separately, and if you do it must match the signing key");
		}
		this.verifier = verifier;
	}

}
