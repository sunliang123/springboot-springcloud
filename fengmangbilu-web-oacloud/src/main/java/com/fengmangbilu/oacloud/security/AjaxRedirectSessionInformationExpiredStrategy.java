package com.fengmangbilu.oacloud.security;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;

import com.alibaba.fastjson.JSON;
import com.fengmangbilu.web.Response;

public class AjaxRedirectSessionInformationExpiredStrategy implements SessionInformationExpiredStrategy {

	public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException {
		HttpServletResponse response = event.getResponse();
		Response data = Response.error(10998, "亲，您的帐号在另一处被登录！");
		response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
		response.getWriter().write(JSON.toJSONString(data));
		response.flushBuffer();
	}

}
