package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OstaInfoItem {
    
    @XmlElement
    private String certificateID;
    
    @XmlElement
    private String occupation;
    
    @XmlElement
    private String level;
    
    @XmlElement
    private String submitOrgName;
    
    @XmlElement
    private String cityName;
    
    @XmlElement
    private String banZhengRiQi;
    
    @XmlElement
    private String avgNationalSalary;

    public String getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSubmitOrgName() {
        return submitOrgName;
    }

    public void setSubmitOrgName(String submitOrgName) {
        this.submitOrgName = submitOrgName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getBanZhengRiQi() {
        return banZhengRiQi;
    }

    public void setBanZhengRiQi(String banZhengRiQi) {
        this.banZhengRiQi = banZhengRiQi;
    }

    public String getAvgNationalSalary() {
        return avgNationalSalary;
    }

    public void setAvgNationalSalary(String avgNationalSalary) {
        this.avgNationalSalary = avgNationalSalary;
    }

}
