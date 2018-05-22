package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoItem {

    @XmlElement
    private String alCount;
    
    @XmlElement
    private String zxCount;
    
    @XmlElement
    private String sxCount;
    
    @XmlElement
    private String swCount;
    
    @XmlElement
    private String cqggCount;
    
    @XmlElement
    private String wdyqCount;

    public String getAlCount() {
        return alCount;
    }

    public void setAlCount(String alCount) {
        this.alCount = alCount;
    }

    public String getZxCount() {
        return zxCount;
    }

    public void setZxCount(String zxCount) {
        this.zxCount = zxCount;
    }

    public String getSxCount() {
        return sxCount;
    }

    public void setSxCount(String sxCount) {
        this.sxCount = sxCount;
    }

    public String getSwCount() {
        return swCount;
    }

    public void setSwCount(String swCount) {
        this.swCount = swCount;
    }

    public String getCqggCount() {
        return cqggCount;
    }

    public void setCqggCount(String cqggCount) {
        this.cqggCount = cqggCount;
    }

    public String getWdyqCount() {
        return wdyqCount;
    }

    public void setWdyqCount(String wdyqCount) {
        this.wdyqCount = wdyqCount;
    }
  
}

