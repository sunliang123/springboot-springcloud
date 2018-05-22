package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoCqsItem {

    @XmlElement
    private String recordId;
    
    @XmlElement(name = "fix")
    private PersonRiskInfoCqsItemFix fix;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public PersonRiskInfoCqsItemFix getFix() {
        return fix;
    }

    public void setFix(PersonRiskInfoCqsItemFix fix) {
        this.fix = fix;
    }
    
    
}
