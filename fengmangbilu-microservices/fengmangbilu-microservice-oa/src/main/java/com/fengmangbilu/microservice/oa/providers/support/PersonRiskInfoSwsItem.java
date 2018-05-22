package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoSwsItem {

    @XmlElement
    private String recordId;
    
    @XmlElement(name = "fix")
    private PersonRiskInfoSwsItemFix fix;
    
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public PersonRiskInfoSwsItemFix getFix() {
        return fix;
    }

    public void setFix(PersonRiskInfoSwsItemFix fix) {
        this.fix = fix;
    }

}
