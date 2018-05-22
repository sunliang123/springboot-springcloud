package com.fengmangbilu.microservice.user.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MultipartException;

import com.fengmangbilu.annotation.JsonFilter;
import com.fengmangbilu.microservice.user.exceptions.UserException;
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

	@ExceptionHandler(UserException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handleUserException(UserException ex) {
		return Response.error(ex.getCode(), ex.getMessage());
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		BindingResult result = ex.getBindingResult();
		FieldError fieldError = result.getFieldError();
		String message = fieldError.getDefaultMessage();
		return Response.error(UserException.getCode(message), UserException.getMessage(message));
	}

	@ExceptionHandler(AuthenticationException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handlerAuthenticationException(AuthenticationException ex) {
		UserException error = UserException.ERR_UNKNOW;
		int code = error.getCode();
		String message = ex.getMessage();
		if (ex instanceof BadCredentialsException) {
			error = UserException.ERR_PASSWORD_INCORRECT;
			code = error.getCode();
			message = error.getMessage();
		}
		if (ex instanceof UsernameNotFoundException) {
			error = UserException.ERR_MOBILE_NOT_FOUND;
			code = error.getCode();
			message = error.getMessage();
		}
		return Response.error(code, message);
	}

	@ExceptionHandler(MultipartException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handlerMultipartException(MultipartException ex) {
		UserException error = UserException.ERR_FILE_SIZE;
		return Response.error(error.getCode(), error.getMessage());
	}
	
	@ExceptionHandler(AccessDeniedException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handlerAccessDeniedException(AccessDeniedException ex) {
		return Response.error(HttpStatus.FORBIDDEN.value(), ex.getMessage());
	}
}
