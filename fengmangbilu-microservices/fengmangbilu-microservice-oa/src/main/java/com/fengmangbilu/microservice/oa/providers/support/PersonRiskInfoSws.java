package com.fengmangbilu.microservice.oa.providers.support;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoSws {

    @XmlElement(name = "item")
    private List<PersonRiskInfoSwsItem> item;

    public List<PersonRiskInfoSwsItem> getItem() {
        return item;
    }

    public void setItem(List<PersonRiskInfoSwsItem> item) {
        this.item = item;
    }
    
}
