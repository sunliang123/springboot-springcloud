package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoDetails {

    @XmlElement(name = "als")
    private PersonRiskInfoAls als;

    @XmlElement(name = "zxs")
    private PersonRiskInfoZxs zxs;
    
    @XmlElement(name = "sxs")
    private PersonRiskInfoSxs sxs;
    
    @XmlElement(name = "sws")
    private PersonRiskInfoSws sws;
    
    @XmlElement(name = "cqs")
    private PersonRiskInfoCqs cqs;
    
    @XmlElement(name = "wdyqs")
    private PersonRiskInfoWdyqs wdyqs;

    public PersonRiskInfoAls getAls() {
        return als;
    }

    public void setAls(PersonRiskInfoAls als) {
        this.als = als;
    }

    public PersonRiskInfoZxs getZxs() {
        return zxs;
    }

    public void setZxs(PersonRiskInfoZxs zxs) {
        this.zxs = zxs;
    }

    public PersonRiskInfoSxs getSxs() {
        return sxs;
    }

    public void setSxs(PersonRiskInfoSxs sxs) {
        this.sxs = sxs;
    }

    public PersonRiskInfoSws getSws() {
        return sws;
    }

    public void setSws(PersonRiskInfoSws sws) {
        this.sws = sws;
    }

    public PersonRiskInfoCqs getCqs() {
        return cqs;
    }

    public void setCqs(PersonRiskInfoCqs cqs) {
        this.cqs = cqs;
    }

    public PersonRiskInfoWdyqs getWdyqs() {
        return wdyqs;
    }

    public void setWdyqs(PersonRiskInfoWdyqs wdyqs) {
        this.wdyqs = wdyqs;
    }
    
    
}
