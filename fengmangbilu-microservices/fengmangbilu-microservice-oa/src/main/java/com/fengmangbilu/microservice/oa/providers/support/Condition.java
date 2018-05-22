package com.fengmangbilu.microservice.oa.providers.support;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Condition {
    
    @XmlElement(name="item")
    private List<Item> item;
    
    @XmlAttribute  
    private String queryType;
    
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItems(List<Item> item) {
        this.item = item;
    }
}
