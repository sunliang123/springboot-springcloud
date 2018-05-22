package com.fengmangbilu.security.exceptions;

import org.springframework.security.core.SpringSecurityCoreVersion;

public class ExpiredTokenException extends TokenException {

	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

	public ExpiredTokenException(String msg) {
		super(msg);
	}
	
	@Override
	public int getTokenErrorCode() {
		return 902;
	}
}
