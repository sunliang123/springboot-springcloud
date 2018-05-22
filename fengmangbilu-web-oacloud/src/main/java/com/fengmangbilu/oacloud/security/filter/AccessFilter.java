package com.fengmangbilu.oacloud.security.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.fengmangbilu.security.token.TokenService;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class AccessFilter extends ZuulFilter {

	private static final int FILTER_ORDER = 9;
	
	@Autowired
	private TokenService tokenService;

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return FILTER_ORDER;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		final RequestContext ctx = RequestContext.getCurrentContext();
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		ctx.addZuulRequestHeader("Authorization", "Bearer "+tokenService.createAccessToken(authentication).getToken());
		return null;
	}
}