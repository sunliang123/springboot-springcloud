package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoZxsItem {

    @XmlElement
    private String recordId;
    
    @XmlElement(name = "fix")
    private PersonRiskInfoZxsItemFix fix;
    
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public PersonRiskInfoZxsItemFix getFix() {
        return fix;
    }

    public void setFix(PersonRiskInfoZxsItemFix fix) {
        this.fix = fix;
    }

}
