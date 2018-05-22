package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonIgnoreProperties({"id", "riskInfo"})
@Table(name = "fengmangbilu_risk_sxs_info")
public class RiskSxsInfo extends SimpleEntity {

	private String bt;

	private String bzxr;

	private String zjhm;

	private String ah;

	private String xb;

	private String nl;

	private String zxfy;

	private String sf;

	private String yjwh;

	private String lasj;

	private String yjdw;

	@Column(length = 3000)
	private String flwsyw;

	private String lxqk;

	private String ylx;

	private String wlx;

	private String xwjtqx;

	private String fbsj;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private RiskInfo riskInfo;
}
