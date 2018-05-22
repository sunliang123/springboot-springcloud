package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CisReports {
    
    @XmlElement
    private CisReport cisReport;
    
    @XmlAttribute
    private String batNo;

    public CisReport getCisReport() {
        return cisReport;
    }

    public void setCisReport(CisReport cisReport) {
        this.cisReport = cisReport;
    }

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo;
    }
    
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
    
}
