package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoCqsItemFix {

    @XmlElement(name = "fzr")
    private PersonRiskInfoCqsItemFixFzr fzr;
    
    @XmlElement(name = "dbjbr")
    private PersonRiskInfoCqsItemFixDbjbr dbjbr;
    
    @XmlElement(name = "qkjbr")
    private PersonRiskInfoCqsItemFixQkjbr qkjbr;
    
    @XmlElement(name = "dbgd")
    private PersonRiskInfoCqsItemFixDbgd dbgd;
    
    @XmlElement(name = "qkgd")
    private PersonRiskInfoCqsItemFixQkgd qkgd;
    
    @XmlElement
    private String bt;
    
    @XmlElement
    private String cqje;

    @XmlElement
    private String bcqr;
    
    @XmlElement
    private String fbjs;
    
    @XmlElement
    private String zt;

    public PersonRiskInfoCqsItemFixFzr getFzr() {
        return fzr;
    }

    public void setFzr(PersonRiskInfoCqsItemFixFzr fzr) {
        this.fzr = fzr;
    }

    public PersonRiskInfoCqsItemFixDbjbr getDbjbr() {
        return dbjbr;
    }

    public void setDbjbr(PersonRiskInfoCqsItemFixDbjbr dbjbr) {
        this.dbjbr = dbjbr;
    }

    public PersonRiskInfoCqsItemFixQkjbr getQkjbr() {
        return qkjbr;
    }

    public void setQkjbr(PersonRiskInfoCqsItemFixQkjbr qkjbr) {
        this.qkjbr = qkjbr;
    }

    public PersonRiskInfoCqsItemFixDbgd getDbgd() {
        return dbgd;
    }

    public void setDbgd(PersonRiskInfoCqsItemFixDbgd dbgd) {
        this.dbgd = dbgd;
    }

    public PersonRiskInfoCqsItemFixQkgd getQkgd() {
        return qkgd;
    }

    public void setQkgd(PersonRiskInfoCqsItemFixQkgd qkgd) {
        this.qkgd = qkgd;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public String getCqje() {
        return cqje;
    }

    public void setCqje(String cqje) {
        this.cqje = cqje;
    }

    public String getBcqr() {
        return bcqr;
    }

    public void setBcqr(String bcqr) {
        this.bcqr = bcqr;
    }

    public String getFbjs() {
        return fbjs;
    }

    public void setFbjs(String fbjs) {
        this.fbjs = fbjs;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }
    
    
    
}
