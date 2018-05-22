package com.fengmangbilu.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "security")
public class TokenSecurityProperties {
	
	private String[] ignored = new String[] {};

	public String[] getIgnored() {
		return ignored;
	}

	public void setIgnored(String[] ignored) {
		this.ignored = ignored;
	}
}
