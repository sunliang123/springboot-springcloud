package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Column;
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
@Table(name = "fengmangbilu_risk_wdyqs_info")
public class RiskWdyqsInfo extends SimpleEntity {

	@Column(length = 50)
	private String bt;

	@Column(length = 10)
	private String xm;

	@Column(length = 50)
	private String zfzh;

	@Column(length = 50)
	private String jzdh;

	@Column(length = 50)
	private String jgdz;

	@Column(length = 50)
	private String bjbx;

	@Column(length = 50)
	private String dksj;

	@Column(length = 50)
	private String yhje;

	@Column(length = 50)
	private String whfx;

	@Column(length = 50)
	private String hkzt;

	@Column(length = 50)
	private String gxsj;

	@Column(length = 50)
	private String sjlydwmc;

	@Column(length = 15000)
	private String photo;

	@Column(length = 10)
	private String photoType;

	@ManyToOne(fetch = FetchType.LAZY)
	private RiskInfo riskInfo;

}
