package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 学校信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_school_info")
public class SchoolInfo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String dept;
    
    @Column(length = 50)
    private String address;
    
    @Column(length = 50)
    private String level;
    
    @Column(length = 50)
    private String nature;
    
    @Column(length = 2)
    private Boolean is985;
    
    @Column(length = 2)
    private Boolean is211;
    
    @Column(length = 50)
    private String url;
    
    private Boolean topUniversity;
    
    private Boolean topSubject;
}
