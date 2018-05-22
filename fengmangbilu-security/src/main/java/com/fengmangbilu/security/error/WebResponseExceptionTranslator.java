package com.fengmangbilu.security.error;

import org.springframework.http.ResponseEntity;

public interface WebResponseExceptionTranslator<T> {

	ResponseEntity<T> translate(Exception e) throws Exception;
}
