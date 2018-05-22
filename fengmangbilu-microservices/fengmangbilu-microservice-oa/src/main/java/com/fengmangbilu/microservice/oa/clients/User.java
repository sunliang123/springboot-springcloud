package com.fengmangbilu.microservice.oa.clients;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 个人信息
 */
@Getter
@Setter
public class User{

	private String userId;

	private String avatar;
	
	private String nickname;

	private String mobile;
	
	private String email;

	private String password;

	private Date lastLoginDate;

	private Date lastPasswordResetDate;

	private boolean accountNonExpired = true;

	private boolean accountNonLocked = true;

	private boolean credentialsNonExpired = true;

	private boolean enabled = true;

	private Boolean isCertified = false;
}
