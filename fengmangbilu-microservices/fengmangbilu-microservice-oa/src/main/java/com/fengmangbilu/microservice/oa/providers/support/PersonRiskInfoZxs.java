package com.fengmangbilu.microservice.oa.providers.support;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoZxs {

    @XmlElement(name = "item")
    private List<PersonRiskInfoZxsItem> item;

    public List<PersonRiskInfoZxsItem> getItem() {
        return item;
    }

    public void setItem(List<PersonRiskInfoZxsItem> item) {
        this.item = item;
    }
}
