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
@Table(name = "fengmangbilu_risk_cqs_info")
public class RiskCqsInfo extends SimpleEntity {

	private String bt;

	private String cqje;

	private String bcqr;

	private String fbjs;

	private String zt;

	private String dbgdXm;

	private String dbgdSfzhm;

	private String dbgdXb;

	private String dbgdZj;

	private String dbgdXxdz;

	private String dbgdDz;

	private String dbjbrXm;

	private String dbjbrSfzhm;

	private String dbjbrXb;

	private String dbjbrSjhm;

	private String dbjbrZj;

	private String dbjbrDzyj;

	private String dbjbrXxdz;

	private String dbjbrDz;

	private String fzrXm;

	private String fzrZw;

	private String fzrSjhm;

	private String fzrFbjs;

	private String fzrZj;

	private String fzrDzyj;

	private String fzrXxdz;

	private String fzrDz;

	private String qkgdXm;

	private String qkgdSfzhm;

	private String qkgdXb;

	private String qkgdZj;

	private String qkgdXxdz;

	private String qkgdDz;

	private String qkjbrXm;

	private String qkjbrSfzhm;

	private String qkjbrXb;

	private String qkjbrZj;

	private String qkjbrXxdz;

	private String qkjbrDz;

	private String qkjbrDzyj;

	private String qkjbrSjhm;

	@ManyToOne(fetch = FetchType.LAZY)
	private RiskInfo riskInfo;
}
