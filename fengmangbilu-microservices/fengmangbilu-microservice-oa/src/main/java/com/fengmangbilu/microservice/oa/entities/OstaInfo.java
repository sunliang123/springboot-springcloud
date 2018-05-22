package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 职业资格信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_osta_info")
public class OstaInfo extends SimpleEntity{

	/** 姓名 **/
    @Column(length = 30)
    private String name;
    
    /** 身份证号 **/
    @Column(length = 20)
    private String idCard;
    
    /** 证书编号 **/
    @Column(length = 50)
    private String certificateID;
    
    /** 职业名称 **/
    @Column(length = 50)
    private String occupation;
    
    /** 级别 **/
    @Column(length = 20)
    private String level;
    
    /** 发证日期 **/
    @Column(length = 20)
    private String banZhengRiQi;
    
    /** 发证单位 **/
    @Column(length = 100)
    private String submitOrgName;
    
    /** 当前工作所在地 **/
    @Column(length = 100)
    private String cityName;
    
    /** 全国月平均工资 **/
    @Column(length = 50)
    private String avgNationalSalary;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
	private ReportInfo reportInfo;
    
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
