package com.fengmangbilu.oacloud.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.alibaba.fastjson.JSON;
import com.fengmangbilu.web.Response;

public class AjaxAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
			throws IOException, ServletException {
		Response data = Response.error(authException.getMessage());
		if (authException instanceof InsufficientAuthenticationException) {
			data = Response.error(10999, "亲，您还没有登录，请先登录！");
		}
		response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
		response.getWriter().write(JSON.toJSONString(data));
		response.flushBuffer();
	}

}
