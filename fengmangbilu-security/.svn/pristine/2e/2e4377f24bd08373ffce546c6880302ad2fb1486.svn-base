package com.fengmangbilu.security.token;

import java.util.Date;

import org.springframework.security.core.SpringSecurityCoreVersion;

import com.fengmangbilu.security.DefaultRefreshToken;

public class DefaultExpiringRefreshToken extends DefaultRefreshToken
		implements ExpiringRefreshToken {

	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

	private final Date expiration;

	public DefaultExpiringRefreshToken(String value, Date expiration) {
		super(value);
		this.expiration = expiration;
	}

	public Date getExpiration() {
		return expiration;
	}

}
