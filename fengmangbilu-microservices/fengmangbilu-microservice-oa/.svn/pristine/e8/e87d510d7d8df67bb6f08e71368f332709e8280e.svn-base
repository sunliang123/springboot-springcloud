package com.fengmangbilu.microservice.oa.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fengmangbilu.annotation.JsonFilter;
import com.fengmangbilu.microservice.oa.exceptions.CompanyException;
import com.fengmangbilu.microservice.oa.exceptions.ReportException;
import com.fengmangbilu.microservice.oa.exceptions.UploadException;
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

	@ExceptionHandler(ReportException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public ResponseEntity<Response> handleCreditException(ReportException ex) {
		Response response = Response.error(ex.getCode(), ex.getMessage());
		return ResponseEntity.ok(response);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	protected Response handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		BindingResult result = ex.getBindingResult();
		String message = result.getFieldError().getDefaultMessage();
		return Response.validationError(message);
	}

	@ExceptionHandler(FileSizeLimitExceededException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handlerFileSizeLimitExceededException(FileSizeLimitExceededException ex) {
		return Response.error(UploadException.ERROR_FILE_SIZE.getCode(), UploadException.ERROR_FILE_SIZE.getMessage());
	}

	@ExceptionHandler(UploadException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handlerUploadException(UploadException ex) {
		return Response.error(ex.getCode(), ex.getMessage());
	}
	
	@ExceptionHandler(CompanyException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handlerCompanyException(CompanyException ex) {
		return Response.error(ex.getCode(), ex.getMessage());
	}
	
	@ExceptionHandler(AccessDeniedException.class)
	@JsonFilter(target = Response.class, filter = {"data", "success"})
	public Response handlerAccessDeniedException(AccessDeniedException ex) {
		return Response.error(HttpStatus.FORBIDDEN.value(), ex.getMessage());
	}
}
