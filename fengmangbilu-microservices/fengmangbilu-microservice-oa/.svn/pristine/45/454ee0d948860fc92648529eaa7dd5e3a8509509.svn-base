package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.fengmangbilu.domain.SimpleEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 身份认证信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_person_info")
public class PersonInfo extends SimpleEntity{

	/** 姓名  **/
    @Column(length = 30)
    private String name;
    
    /** 身份证号  **/
    @Column(length = 20)
    private String idCard;
    
    /** 照片**/
    @Column(length = 20000)
    private String photo;
    
    /**出生年月日  **/
    @Column(length = 20)
    private String birthday;
    
    /** 性别  **/
    @Column(length = 10)
    private String gender;
    
    /** 原籍地址  **/
    @Column(length = 50)
    private String originalAddress;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
