package com.fengmangbilu.security.error;

import org.springframework.http.HttpEntity;
import org.springframework.web.context.request.ServletWebRequest;

public interface TokenExceptionRenderer {
	void handleHttpEntityResponse(HttpEntity<?> responseEntity, ServletWebRequest webRequest) throws Exception;
}
