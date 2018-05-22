package com.fengmangbilu.blog.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fengmangbilu.domain.SimpleEntity;

@Entity
@Table(name = "fengmangbilu_tag")
public class Tag extends SimpleEntity {
	
	/** 标签名称 **/
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
