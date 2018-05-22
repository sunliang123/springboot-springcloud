
package com.fengmangbilu.security;

import java.io.Serializable;
import java.util.Date;

import org.springframework.security.core.SpringSecurityCoreVersion;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DefaultAccessToken implements Serializable, AccessToken {

	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;
	
	private String jti;
	
	private String ati;

	private String token;

	private Date expiration;

	private RefreshToken refreshToken;

	public DefaultAccessToken(String token) {
		this.token = token;
	}

	@SuppressWarnings("unused")
	private DefaultAccessToken() {
		this((String) null);
	}

	public DefaultAccessToken(AccessToken accessToken) {
		this(accessToken.getToken());
		setJti(accessToken.getAti());
		setAti(accessToken.getAti());
		setRefreshToken(accessToken.getRefreshToken());
		setExpiration(accessToken.getExpiration());
	}

	@JsonIgnore
	public String getJti() {
		return jti;
	}

	public void setJti(String jti) {
		this.jti = jti;
	}

	@JsonIgnore
	public String getAti() {
		return ati;
	}

	public void setAti(String ati) {
		this.ati = ati;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@JsonIgnore
	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	@JsonIgnore
	public boolean isExpired() {
		return expiration != null && expiration.before(new Date());
	}

	public RefreshToken getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(RefreshToken refreshToken) {
		this.refreshToken = refreshToken;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && toString().equals(obj.toString());
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public String toString() {
		return String.valueOf(getToken());
	}
}
