package com.fengmangbilu.microservice.oa.providers.support;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoWdyqs {

    @XmlElement(name = "item")
    private List<PersonRiskInfoWdyqsItem> item;

    public List<PersonRiskInfoWdyqsItem> getItem() {
        return item;
    }

    public void setItem(List<PersonRiskInfoWdyqsItem> item) {
        this.item = item;
    }
}
