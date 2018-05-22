package com.fengmangbilu.microservice.oa.providers.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonRiskInfoCqsItemFixFzr {
    @XmlElement
    private String xm;

    @XmlElement
    private String zw;

    @XmlElement
    private String sjhm;

    @XmlElement
    private String fbjs;

    @XmlElement
    private String zj;

    @XmlElement
    private String dzyj;

    @XmlElement
    private String xxdz;

    @XmlElement
    private String dz;

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getFbjs() {
        return fbjs;
    }

    public void setFbjs(String fbjs) {
        this.fbjs = fbjs;
    }

    public String getZj() {
        return zj;
    }

    public void setZj(String zj) {
        this.zj = zj;
    }

    public String getDzyj() {
        return dzyj;
    }

    public void setDzyj(String dzyj) {
        this.dzyj = dzyj;
    }

    public String getXxdz() {
        return xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }
}
