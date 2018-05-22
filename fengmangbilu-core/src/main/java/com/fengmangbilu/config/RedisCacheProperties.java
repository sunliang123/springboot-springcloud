package com.fengmangbilu.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.redis.cache")
public class RedisCacheProperties {

	private Expire expire = new Expire();

	public static class Expire {
		/** 默认的超时时间, 默认值时1小时=3600秒 */
		private long expiration = 3600;

		/** 每个cache 的超时时间 */
		private Map<String, Long> map = new HashMap<String, Long>();;

		public long getExpiration() {
			return expiration;
		}

		public void setExpiration(long expiration) {
			this.expiration = expiration;
		}

		public Map<String, Long> getMap() {
			return map;
		}

		public void setMap(Map<String, Long> map) {
			this.map = map;
		}

	}
	
	public Expire getExpire() {
		return expire;
	}

	public void setExpire(Expire expire) {
		this.expire = expire;
	}

}
