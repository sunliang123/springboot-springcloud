package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfo {

    @XmlAttribute
    private String treatResult;

    @XmlAttribute
    private String errorMessage;

    @XmlElement(name = "stat")
    private PersonRiskInfoItem item;
    
    @XmlElement(name = "details")
    private PersonRiskInfoDetails details;

    public String getTreatResult() {
        return treatResult;
    }

    public void setTreatResult(String treatResult) {
        this.treatResult = treatResult;
    }

    public PersonRiskInfoItem getItem() {
        return item;
    }

    public void setItem(PersonRiskInfoItem item) {
        this.item = item;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public PersonRiskInfoDetails getDetails() {
        return details;
    }

    public void setDetails(PersonRiskInfoDetails details) {
        this.details = details;
    }
    
}
