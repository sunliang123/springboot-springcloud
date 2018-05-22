package com.fengmangbilu.security.error;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class TokenAccessDeniedHandler extends AbstractTokenSecurityExceptionHandler implements AccessDeniedHandler {

	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException authException)
			throws IOException, ServletException {
		doHandle(request, response, authException);
	}

}
