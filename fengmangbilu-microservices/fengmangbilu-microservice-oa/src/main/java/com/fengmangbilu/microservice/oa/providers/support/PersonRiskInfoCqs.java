package com.fengmangbilu.microservice.oa.providers.support;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoCqs {

    @XmlElement(name = "item")
    private List<PersonRiskInfoCqsItem> item;

    public List<PersonRiskInfoCqsItem> getItem() {
        return item;
    }

    public void setItem(List<PersonRiskInfoCqsItem> item) {
        this.item = item;
    }
}
