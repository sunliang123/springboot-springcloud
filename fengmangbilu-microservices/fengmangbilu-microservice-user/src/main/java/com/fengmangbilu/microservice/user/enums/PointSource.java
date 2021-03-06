package com.fengmangbilu.microservice.user.enums;

/***
 * 积分来源
 */
public enum PointSource {

	EVENT(100, "官网活动"),
	TASK(101, "官网任务"),
	TRADE(102, "官网交易"),
	EXCHANGE(104, "积分兑换");

	private int code;

	private String desc;

	private PointSource(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
