package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 风险评估信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_risk_assess_info")
public class RiskAssessInfo extends SimpleEntity {

    /** 姓名 **/
    @Column(length = 20)
    private String name;

    /** 身份证 **/
    @Column(length = 25)
    private String idCard;
    
    /** 评估结果 **/
    @Column(length = 25)
    private String result;
}
