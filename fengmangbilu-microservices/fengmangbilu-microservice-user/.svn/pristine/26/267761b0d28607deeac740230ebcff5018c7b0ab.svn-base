package com.fengmangbilu.microservice.user.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fengmangbilu.domain.SimpleEntity;
import com.fengmangbilu.validator.constraints.Unique;

/**
 * 个人积分
 */
@Entity
@Unique(reportOn = "userId")
@Table(name = "fengmangbilu_user_point")
public class UserPoint extends SimpleEntity {

	/** 所属用户 **/
	@Column(length = 50)
	private String userId;

	/** 用户当前积分 **/
	private long points = 0l;

	/** 用户总收益积分 **/
	private long totalPoints = 0l;

	/** 用户总支出积分 **/
	private long totalExpend = 0l;

	/** 用户冻结的积分 **/
	private long frozenPoints = 0l;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getPoints() {
		return points;
	}

	public void setPoints(long points) {
		this.points = points;
	}

	public long getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(long totalPoints) {
		this.totalPoints = totalPoints;
	}

	public long getTotalExpend() {
		return totalExpend;
	}

	public void setTotalExpend(long totalExpend) {
		this.totalExpend = totalExpend;
	}

	public long getFrozenPoints() {
		return frozenPoints;
	}

	public void setFrozenPoints(long frozenPoints) {
		this.frozenPoints = frozenPoints;
	}

}
