package com.fengmangbilu.microservice.oa.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_enterprise_info")
public class EnterpriseInfo extends SimpleEntity{
	
	@Column(length = 30)
	private String name; // 姓名
	
	@Column(length = 20)
	private String idCard; // 身份证号

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "enterpriseInfo", fetch = FetchType.EAGER)
	private Set<CorporateCaseInfo> caseInfos;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "enterpriseInfo", fetch = FetchType.EAGER)
	private Set<Corporate> corporates;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "enterpriseInfo", fetch = FetchType.EAGER)
	private Set<CorporateManager> corporateManagers;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "enterpriseInfo", fetch = FetchType.EAGER)
	private Set<CorporateShareholder> corporateShareholders;
}
