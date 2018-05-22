package com.fengmangbilu.oacloud.security.user;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Authority implements GrantedAuthority{

	private static final long serialVersionUID = -5356591806570753794L;
	
	private String authority;
}
