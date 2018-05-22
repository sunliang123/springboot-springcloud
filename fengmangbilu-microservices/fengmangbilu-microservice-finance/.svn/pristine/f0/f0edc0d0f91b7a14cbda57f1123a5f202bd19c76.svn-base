package com.fengmangbilu.microservice.finance.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 微信签名工具类
 */
public class SignUtil {

	private static final Logger logger = LoggerFactory.getLogger(SignUtil.class);

	/**
	 * 签名算法
	 * @param 要参与签名的数据对象
	 * @return 签名
	 * @throws IllegalAccessException
	 */
	public static String getSign(Object o, String key) {
		List<String> list = new ArrayList<String>();
		List<Field> fields = new ArrayList<Field>();
		Class<? extends Object> cls = o.getClass();
		while (cls != null) {
			fields.addAll(Arrays.asList(cls.getDeclaredFields()));
			cls = cls.getSuperclass();
		}
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				if (field.get(o) != null && field.get(o) != "") {
					String fieldName = field.getName();
					if (!"sign".equals(fieldName) && !"key".equals(fieldName)) {
						if (field.isAnnotationPresent(XmlElement.class)) {
							list.add(field.getAnnotation(XmlElement.class).name() + "=" + field.get(o) + "&");
						} else {
							list.add(field.getName() + "=" + field.get(o) + "&");
						}
					}
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		int size = list.size();
		String[] arrayToSort = list.toArray(new String[size]);
		Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(arrayToSort[i]);
		}
		String result = sb.toString();
		result += "key=" + key;
		logger.debug("【微信支付验签】Sign Before MD5:" + result);
		result = DigestUtils.md5Hex(result).toUpperCase();
		logger.debug("【微信支付验签】Sign Result:" + result);
		return result;
	}

	public static String getSign(Map<String, Object> map, String key) {
		ArrayList<String> list = new ArrayList<String>();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			Object value = entry.getValue();
			if (!"".equals(value) && !"sign".equals(value) && !"key".equals(value)) {
				list.add(entry.getKey() + "=" + entry.getValue() + "&");
			}
		}
		int size = list.size();
		String[] arrayToSort = list.toArray(new String[size]);
		Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(arrayToSort[i]);
		}
		String result = sb.toString();
		result += "key=" + key;
		logger.debug("【微信支付验签】Sign Before MD5:" + result);
		result = DigestUtils.md5Hex(result).toUpperCase();
		logger.debug("【微信支付验签】Sign Result:" + result);
		return result;
	}
}
