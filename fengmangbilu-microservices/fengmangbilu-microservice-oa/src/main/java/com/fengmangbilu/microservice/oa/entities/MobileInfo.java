package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fengmangbilu.domain.SimpleEntity;
import com.fengmangbilu.microservice.oa.enums.Provider;

import lombok.Getter;
import lombok.Setter;

/**
 * 手机实名信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_mobile_info")
public class MobileInfo extends SimpleEntity {

	/** 姓名 **/
	@Column(length = 20)
	private String name;

	/** 身份证 **/
	@Column(length = 25)
	private String idCard;

	/** 手机号 **/
	@Column(length = 20)
	private String mobile;

	/** 归属地 **/
	@Column(length = 20)
	private String areaName;

	@Enumerated(EnumType.ORDINAL)
	private Provider provider;

	/** 是否实名 **/
	private boolean identical = true;
}
