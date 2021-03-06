package com.fengmangbilu.microservice.oa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fengmangbilu.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 员工信息
 */
@Getter
@Setter
@Entity
@Table(name = "fengmangbilu_staff_info")
public class StaffInfo extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** 姓名 **/
	@Column(length = 20)
	private String name;

	/** 身份证号  **/
	@Column(length = 20)
	private String idCard;

	/** 手机号  **/
	@Column(length = 20)
	private String mobile;

	/** 公司 **/
	@Column(length = 20)
	private Long companyId;

	/** 部门 **/
	@Column(length = 20)
	private Long deptId;

	/** 职位 **/
	@Column(length = 20)
	private String position;

	/** 入职日期 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date entryDate;

	/** 离职日期 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date dimissionDate;

	/** 是否激活(注册) **/
	private Boolean isActive;

	/** 是否在职 **/
	private Boolean isLeave;

	/** 用户id **/
	private String userId;
	
	/** 离职证明  **/
	@Formula("(select r.leave_prove from fengmangbilu_report_push_info r where r.id_card = id_card and r.mobile = mobile limit 1)")
	private String leaveProve;
	
	/** 身份证正面照 **/
	@Formula("(select i.front_image from fengmangbilu_idcard_info i where i.id_card = id_card limit 1)")
	private String frontImage;

	/** 身份证背面照 **/
	@Formula("(select i.back_image from fengmangbilu_idcard_info i where i.id_card = id_card limit 1)")
	private String backImage;

	/** 头像 **/
	@Formula("(select i.head_image from fengmangbilu_idcard_info i where i.id_card = id_card limit 1)")
	private String headImage;
	
	/** 专业 **/
	@Formula("(select e.speciality_name from fengmangbilu_education_info e where e.id_card = id_card limit 1)")
	private String specialityName;
	
	/** 学校 **/
	@Formula("(select e.graduate from fengmangbilu_education_info e where e.id_card = id_card limit 1)")
	private String graduate;
	
	/** 学历 **/
	@Formula("(select e.education_degree from fengmangbilu_education_info e where e.id_card = id_card limit 1)")
	private String education;
	
	/** 职业资格证条数 */
	@Formula("(select count(DISTINCT o.certificateID) from fengmangbilu_osta_info o where o.id_card = id_card limit 1)")
	private Long zyzgCount;
	
	/** 司法案例信息条数 */
	@Formula("(select r.al_count from fengmangbilu_risk_info r where r.id_card = id_card limit 1)")
	private Long alCount;

	/** 司法执行信息条数 */
	@Formula("(select r.zx_count from fengmangbilu_risk_info r where r.id_card = id_card limit 1)")
	private Long zxCount;

	/** 司法失信信息条数 */
	@Formula("(select r.sx_count from fengmangbilu_risk_info r where r.id_card = id_card limit 1)")
	private Long sxCount;

	/** 税务行政执法信息条数 */
	@Formula("(select r.sw_count from fengmangbilu_risk_info r where r.id_card = id_card limit 1)")
	private Long swCount;

	/** 催欠公告信息条数 */
	@Formula("(select r.cqgg_count from fengmangbilu_risk_info r where r.id_card = id_card limit 1)")
	private Long cqggCount;

	/** 网贷逾期信息条数 */
	@Formula("(select r.wdyq_count from fengmangbilu_risk_info r where r.id_card = id_card limit 1)")
	private Long wdyqCount;
	
	/** 部门名称 **/
	@Formula("(select d.name from fengmangbilu_dept_info d where d.dept_id = dept_id)")
	private String deptName;

	/** 公司名称 **/
	@Formula("(select c.name from fengmangbilu_company_info c where c.id = company_id)")
	private String companyName;
}
