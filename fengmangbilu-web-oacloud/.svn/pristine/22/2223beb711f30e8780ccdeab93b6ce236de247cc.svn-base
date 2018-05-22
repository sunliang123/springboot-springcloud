package com.fengmangbilu.oacloud.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fengmangbilu.annotation.JsonFilter;
import com.fengmangbilu.web.Response;

@RequestMapping
@RestControllerAdvice
public class ErrorController extends AbstractErrorController {

	public ErrorController(ErrorAttributes errorAttributes) {
		super(errorAttributes);
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

	@ResponseBody
	@RequestMapping("/error")
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response error(HttpServletRequest request) {
		Map<String, Object> errorMap = getErrorAttributes(request, true);
		HttpStatus status = getStatus(request);
		String message = (String) errorMap.get("error");
		message = StringUtils.hasText(message) ? message : status.getReasonPhrase();
		return Response.error(status.value(), status.getReasonPhrase());
	}

}
