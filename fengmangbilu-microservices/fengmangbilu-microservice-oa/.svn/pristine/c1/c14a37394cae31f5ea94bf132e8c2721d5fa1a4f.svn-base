package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CisReport {

	@XmlAttribute
	private String reportID;

	@XmlElement
	private PersonRiskInfo personRiskInfo;

	@XmlElement
	private PoliceCheckInfo policeCheckInfo;

	@XmlElement
	private PersonBaseInfo personBaseInfo;

	@XmlElement(name = "ostaInfo")
	private OstaInfos ostaInfos;

	@XmlElement
	private PersonRiskAssess personRiskAssess;
	
	public String getReportID() {
		return reportID;
	}

	public void setReportID(String reportID) {
		this.reportID = reportID;
	}

	public PersonRiskInfo getPersonRiskInfo() {
		return personRiskInfo;
	}

	public void setPersonRiskInfo(PersonRiskInfo personRiskInfo) {
		this.personRiskInfo = personRiskInfo;
	}

	public OstaInfos getOstaInfos() {
		return ostaInfos;
	}

	public void setOstaInfos(OstaInfos ostaInfos) {
		this.ostaInfos = ostaInfos;
	}

	public PersonBaseInfo getPersonBaseInfo() {
		return personBaseInfo;
	}

	public void setPersonBaseInfo(PersonBaseInfo personBaseInfo) {
		this.personBaseInfo = personBaseInfo;
	}

	public PoliceCheckInfo getPoliceCheckInfo() {
		return policeCheckInfo;
	}

	public void setPoliceCheckInfo(PoliceCheckInfo policeCheckInfo) {
		this.policeCheckInfo = policeCheckInfo;
	}

	public PersonRiskAssess getPersonRiskAssess() {
		return personRiskAssess;
	}

	public void setPersonRiskAssess(PersonRiskAssess personRiskAssess) {
		this.personRiskAssess = personRiskAssess;
	}

}
