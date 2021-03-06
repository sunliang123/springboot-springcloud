package com.fengmangbilu.oacloud.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.security.web.session.InvalidSessionStrategy;

import com.alibaba.fastjson.JSON;
import com.fengmangbilu.web.Response;

public class AjaxRedirectInvalidSessionStrategy implements InvalidSessionStrategy {

	public void onInvalidSessionDetected(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Response data = Response.error(10999, "亲，您还没有登录，请先登录！");
		response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
		response.getWriter().write(JSON.toJSONString(data));
		response.flushBuffer();
	}
}
