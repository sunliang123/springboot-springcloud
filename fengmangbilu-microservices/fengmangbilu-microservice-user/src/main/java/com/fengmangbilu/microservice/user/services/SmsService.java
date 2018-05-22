package com.fengmangbilu.microservice.user.services;

public interface SmsService<T> {
	
	T sendMessage(String telephones, String paramString, String templateCode);
	
	T sendMessage(String telephones, String paramString, String templateCode, String outId);
	
	String getSmsCode(String mobile,String source);

    String putSmsCode(String mobile,String source);
}
