package com.fengmangbilu.security.authentication;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

import com.fengmangbilu.security.AccessToken;

public class BearerTokenExtractor implements TokenExtractor {

	@Override
	public Authentication extract(HttpServletRequest request) {
		String tokenValue = extractHeaderToken(request);
		if (tokenValue != null) {
			PreAuthenticatedAuthenticationToken authentication = new PreAuthenticatedAuthenticationToken(tokenValue,"");
			return authentication;
		}
		return null;
	}

	protected String extractHeaderToken(HttpServletRequest request) {
		Enumeration<String> headers = request.getHeaders(TOKEN_HEADER_NAME);
		while (headers.hasMoreElements()) {
			String value = headers.nextElement();
			if ((value.toLowerCase().startsWith(AccessToken.BEARER_TYPE.toLowerCase()))) {
				String authHeaderValue = value.substring(AccessToken.BEARER_TYPE.length()).trim();
				int commaIndex = authHeaderValue.indexOf(',');
				if (commaIndex > 0) {
					authHeaderValue = authHeaderValue.substring(0, commaIndex);
				}
				return authHeaderValue;
			}
		}
		return null;
	}

}
