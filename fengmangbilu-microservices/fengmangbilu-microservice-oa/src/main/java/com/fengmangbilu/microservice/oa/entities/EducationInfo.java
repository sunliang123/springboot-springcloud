package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 学历信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_education_info")
public class EducationInfo extends SimpleEntity{

    /** 姓名 **/
    @Column(length = 20)
    private String name;

    /** 身份证 **/
    @Column(length = 25)
    private String idCard;
    
    /**入学年份**/
    @Column(length = 20)
    private String enrolDate;
    
    /**毕业结论**/
    @Column(length = 20)
    private String studyResult;
    
    /**学历**/
    @Column(length = 20)
    private String educationDegree;
    
    /**专业**/
    @Column(length = 50)
    private String specialityName;
    
    /**毕业时间**/
    @Column(length = 20)
    private String graduateTime;
    
    /**毕业院校**/
    @Column(length = 50)
    private String graduate;
    
    /**学历类型**/
    @Column(length = 20)
    private String studyStyle;
    
    @Column(length = 50)
    private String jnlNo;
    
    @ManyToOne 
    private SchoolInfo schoolInfo;
    
    /**毕业照片**/
    @Column(length = 20000)
    private String photo; 
    
}
