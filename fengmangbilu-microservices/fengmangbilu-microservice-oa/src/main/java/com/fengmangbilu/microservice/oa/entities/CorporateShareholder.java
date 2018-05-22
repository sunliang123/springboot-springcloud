package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 企业股东信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_corporate_shareholder")
@JsonIgnoreProperties({"enterpriseInfo"})
public class CorporateShareholder extends SimpleEntity {

	/** 查询人姓名 **/
	private String ryName;

	/** 企业(机构)名称 **/
	private String entName;

	/** 注册号 **/
	private String regNo;

	/** 企业(机构)类型 **/
	private String entType;

	/** 注册资本(万元) **/
	private String regCap;

	/** 注册资本币种 **/
	private String regCapCur;

	/** 企业状态 **/
	private String entStatus;

	/** 认缴出资额(万元) **/
	private String subConam;

	/** 认缴出资币种 **/
	private String currency;

	/** 出资比例 **/
	private String fundedRatio;

	@ManyToOne(fetch = FetchType.LAZY)
	private EnterpriseInfo enterpriseInfo;
}
