package com.fengmangbilu.security.error;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.fengmangbilu.security.exceptions.TokenException;

public class TokenAuthenticationEntryPoint extends AbstractTokenSecurityExceptionHandler  implements AuthenticationEntryPoint{
	
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
			throws IOException, ServletException {
		doHandle(request, response, authException);
	}
	
	@Override
	protected ResponseEntity<TokenException> enhanceResponse(ResponseEntity<TokenException> response, Exception exception) {
		HttpHeaders headers = response.getHeaders();
		return new ResponseEntity<TokenException>(response.getBody(), headers, response.getStatusCode());
	}

}