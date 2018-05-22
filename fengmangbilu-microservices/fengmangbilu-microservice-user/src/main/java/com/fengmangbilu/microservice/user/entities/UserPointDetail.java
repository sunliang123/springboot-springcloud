package com.fengmangbilu.microservice.user.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fengmangbilu.domain.SimpleEntity;
import com.fengmangbilu.microservice.user.enums.BizType;
import com.fengmangbilu.microservice.user.enums.PointSource;

@Entity
@Table(name = "fengmangbilu_user_point_detail")
public class UserPointDetail extends SimpleEntity{
	
	/** 操作人  **/
	@Column(length = 50)
	private String userId;
	
	/** 获得原因  **/
	private String acquireReason;

	/** 业务类型 **/
	@Enumerated(EnumType.STRING)
	private BizType bizType;
	
	/** 来源 **/
	@Enumerated(EnumType.STRING)
	private PointSource source;
	
	/** 积分 **/
	private long points = 0l;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAcquireReason() {
		return acquireReason;
	}

	public void setAcquireReason(String acquireReason) {
		this.acquireReason = acquireReason;
	}

	public BizType getBizType() {
		return bizType;
	}

	public void setBizType(BizType bizType) {
		this.bizType = bizType;
	}

	public PointSource getSource() {
		return source;
	}

	public void setSource(PointSource source) {
		this.source = source;
	}

	public long getPoints() {
		return points;
	}

	public void setPoints(long points) {
		this.points = points;
	}
	
}
