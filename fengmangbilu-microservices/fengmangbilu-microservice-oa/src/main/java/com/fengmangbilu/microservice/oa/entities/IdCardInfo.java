package com.fengmangbilu.microservice.oa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fengmangbilu.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_idcard_info")
public class IdCardInfo extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** 姓名 **/
	@Column(length = 20)
	private String name;

	/** 身份证 **/
	@Column(length = 20)
	private String idCard;
	
	/** 身份证 **/
	@Column(length = 20)
	private String mobile;

	/** 性别 **/
	@Column(length = 10)
	private Integer gender;

	/** 出生日期 **/
	@Column(length = 12)
	private Date birthday;

	/** 地址 **/
	@Column(length = 100)
	private String OriginalAddress;

	/** 签发机关 **/
	@Column(length = 50)
	private String idIssued;

	/** 有效开始期限 **/
	@Column(length = 12)
	private String issuedData;

	/** 有效结束期限 **/
	@Column(length = 12)
	private String validDate;

	/** 民族 **/
	@Column(length = 20)
	private String nation;

	/** 身份证正面照 **/
	private String frontImage;

	/** 身份证背面照 **/
	private String backImage;

	/** 头像 **/
	private String headImage;
}
