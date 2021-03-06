
package com.fengmangbilu.security;

import java.io.Serializable;

import org.springframework.security.core.SpringSecurityCoreVersion;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class DefaultRefreshToken implements Serializable, RefreshToken {

	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

	private String value;

	@JsonCreator
	public DefaultRefreshToken(String value) {
		this.value = value;
	}

	@SuppressWarnings("unused")
	private DefaultRefreshToken() {
		this(null);
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getValue();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof DefaultRefreshToken)) {
			return false;
		}

		DefaultRefreshToken that = (DefaultRefreshToken) o;

		if (value != null ? !value.equals(that.value) : that.value != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		return value != null ? value.hashCode() : 0;
	}
}
