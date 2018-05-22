package com.fengmangbilu.microservice.oa.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 个人风险信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_risk_info")
public class RiskInfo extends SimpleEntity {

	/** 姓名 **/
	@Column(length = 20)
	private String name;

	/** 身份证 **/
	@Column(length = 25)
	private String idCard;

	/** 司法案例信息条数 */
	private int alCount = 0;

	/** 司法执行信息条数 */
	private int zxCount = 0;

	/** 司法失信信息条数 */
	private int sxCount = 0;

	/** 税务行政执法信息条数 */
	private int swCount = 0;

	/** 催欠公告信息条数 */
	private int cqggCount = 0;

	/** 网贷逾期信息条数 */
	private int wdyqCount = 0;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "riskInfo", fetch = FetchType.EAGER)
	private Set<RiskAlsInfo> riskAlsInfos;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "riskInfo", fetch = FetchType.EAGER)
	private Set<RiskCqsInfo> riskCqsInfos;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "riskInfo", fetch = FetchType.EAGER)
	private Set<RiskSwsInfo> riskSwsInfos;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "riskInfo", fetch = FetchType.EAGER)
	private Set<RiskSxsInfo> riskSxsInfos;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "riskInfo", fetch = FetchType.EAGER)
	private Set<RiskZxsInfo> riskZxsInfos;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "riskInfo", fetch = FetchType.EAGER)
	private Set<RiskWdyqsInfo> riskWdyqsInfos;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
