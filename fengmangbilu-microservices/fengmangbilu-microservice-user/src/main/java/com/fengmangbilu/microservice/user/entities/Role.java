package com.fengmangbilu.microservice.user.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

import com.fengmangbilu.domain.SimpleEntity;

/**
 * 角色
 */
@Entity
@Table(name = "fengmangbilu_role")
public class Role extends SimpleEntity {

	private String name;
	
	private String value;

	@ManyToMany(targetEntity = Authority.class, fetch = FetchType.EAGER)
	@BatchSize(size = 20)
	private Set<Authority> authorities = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

}