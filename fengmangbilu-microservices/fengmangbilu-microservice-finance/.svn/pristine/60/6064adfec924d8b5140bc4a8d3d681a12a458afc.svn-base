package com.fengmangbilu.microservice.finance.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单状态
 * @author Justice
 */
public enum OrderStatus {

	PAID(1, "已支付"), UNPAID(2, "未支付"), CANCELED(3, "作废");

	private int code;

	private String name;

	private OrderStatus(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus getEnum(int code) {
		OrderStatus result = null;
		OrderStatus[] enums = OrderStatus.values();
		for (int i = 0; i < enums.length; i++) {
			if (enums[i].getCode() == code) {
				result = enums[i];
				break;
			}
		}
		return result;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List toList() {
		OrderStatus[] enums = OrderStatus.values();
		List list = new ArrayList();
		for (int i = 0; i < enums.length; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("value", String.valueOf(enums[i].getCode()));
			map.put("name", enums[i].getName());
			list.add(map);
		}
		return list;
	}

	public static Map<String, Map<String, Object>> toMap() {
		OrderStatus[] enums = OrderStatus.values();
		Map<String, Map<String, Object>> enumMap = new HashMap<String, Map<String, Object>>();
		for (int num = 0; num < enums.length; num++) {
			Map<String, Object> map = new HashMap<String, Object>();
			String key = String.valueOf(getEnum(enums[num].getCode()));
			map.put("value", String.valueOf(enums[num].getCode()));
			map.put("name", enums[num].getName());
			enumMap.put(key, map);
		}
		return enumMap;
	}

}
