package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonIgnoreProperties({"id", "riskInfo"})
@Table(name = "fengmangbilu_risk_als_info")
public class RiskAlsInfo extends SimpleEntity {

	private String bt;

	private String dsrxm;

	private String zjhm;

	private String xb;

	private String sr;

	private String ajlx;

	private String fymc;

	private String sjrq;

	private String ajzh;

	private String slcx;

	private String ay;

	private String pjjg;

	@ManyToOne(fetch = FetchType.LAZY)
	private RiskInfo riskInfo;
}
