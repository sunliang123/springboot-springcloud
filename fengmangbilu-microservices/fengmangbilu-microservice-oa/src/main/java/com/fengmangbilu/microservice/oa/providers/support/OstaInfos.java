package com.fengmangbilu.microservice.oa.providers.support;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OstaInfos {
    
    @XmlAttribute
    private String treatResult;
    
    @XmlElement(name = "item")
    private List<OstaInfoItem> item;
    
    @XmlAttribute
    private String errorMessage;

    public String getTreatResult() {
        return treatResult;
    }

    public void setTreatResult(String treatResult) {
        this.treatResult = treatResult;
    }

    public List<OstaInfoItem> getItem() {
        return item;
    }

    public void setItem(List<OstaInfoItem> item) {
        this.item = item;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
}
