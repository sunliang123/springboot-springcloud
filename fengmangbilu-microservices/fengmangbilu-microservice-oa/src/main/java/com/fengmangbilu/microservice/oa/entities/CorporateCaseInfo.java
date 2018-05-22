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
 * 行政处罚历史信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_corporate_case_info")
@JsonIgnoreProperties({"enterpriseInfo"})
public class CorporateCaseInfo extends SimpleEntity {

	/** 案发时间 **/
	private String caseTime;

	/** 案由 **/
	private String caseReason;

	/** 案值 **/
	private String caseVal;

	/** 案件类型 **/
	private String caseType;

	/** 执行类别 **/
	private String exeSort;

	/** 案件结果 **/
	private String caseResult;

	/** 处罚决定文书 **/
	private String penDecNo;

	/** 处罚决定书签发日期 **/
	private String penDecIssDate;

	/** 做出行政处罚决定机关名 **/
	private String penAuth;

	/** 主要违法事实 **/
	private String illegFact;

	/** 处罚依据 **/
	private String penBasis;

	/** 处罚种类 **/
	private String penType;

	/** 处罚结果 **/
	private String penResult;

	/** 处罚金额 **/
	private String penAm;

	/** 处罚执行情况 **/
	private String penExeSt;

	/** 证件号 **/
	private String cardNO;

	/** 当事人 **/
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	private EnterpriseInfo enterpriseInfo;

}
