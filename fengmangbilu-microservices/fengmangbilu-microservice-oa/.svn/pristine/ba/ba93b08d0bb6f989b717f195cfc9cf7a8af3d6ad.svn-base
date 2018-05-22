package com.fengmangbilu.microservice.oa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fengmangbilu.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_dept_info")
@JsonIgnoreProperties({"createdBy", "lastModifiedBy", "createdDate", "lastModifiedDate"})
public class DeptInfo extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deptId;

	/** 部门名称 **/
	private String name;

	/** 上级部门 **/
	private Long superId = -1l;

	/** 公司信息 **/
	private Long companyId;

	/** 排序 **/
	private Long sortFactor = 0l;

	/** 是否有下级部门 **/
	private Boolean hasSubDept = false;

}
