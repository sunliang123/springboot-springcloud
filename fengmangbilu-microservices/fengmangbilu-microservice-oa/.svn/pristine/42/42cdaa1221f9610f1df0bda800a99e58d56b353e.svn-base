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
@Table(name = "fengmangbilu_risk_zxs_info")
public class RiskZxsInfo extends SimpleEntity {

	private String bt;

	private String bzxr;

	private String zjhm;

	private String zxfy;

	private String ah;

	private String ajzt;

	private String zxbd;

	private String lasj;

	@ManyToOne(fetch = FetchType.LAZY)
	private RiskInfo riskInfo;

}
