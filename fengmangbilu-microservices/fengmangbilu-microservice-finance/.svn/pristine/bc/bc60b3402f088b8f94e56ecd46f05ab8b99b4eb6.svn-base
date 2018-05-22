package com.fengmangbilu.microservice.finance.utils;

import org.apache.commons.text.CharacterPredicate;
import org.apache.commons.text.RandomStringGenerator;

/**
 * 随机字符串工具类
 */
public class RandomUtil {

	public static String generate(int length, char minimumCodePoint, char maximumCodePoint) {
		return new RandomStringGenerator.Builder().withinRange(minimumCodePoint, maximumCodePoint)
				.filteredBy(new CharacterPredicate() {
					@Override
					public boolean test(final int codePoint) {
						return Character.isAlphabetic(codePoint) || Character.isDigit(codePoint);
					}
				}).build().generate(length);
	}
}
