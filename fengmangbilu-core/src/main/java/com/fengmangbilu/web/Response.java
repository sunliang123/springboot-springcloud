package com.fengmangbilu.web;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor 
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"code", "data", "message", "success"})
public class Response {

	/** 状态码 */
	@JsonProperty
	private int code;
	/** 消息内容 */
	@JsonProperty
	private Object data;
	/** 消息提示 */
	@JsonProperty
	private String message;
	/** 是否请求成功 */
	@JsonProperty
	private boolean success;
	
	public Response() {
	}
	/**
	 * 请求成功
	 * @return 响应结果
	 */
	public static Response ok() {
		return Response.builder().code(HttpStatus.OK.value()).success(true).build();
	}

	/**
	 * 请求成功
	 * @param message 消息提示
	 * @return 响应结果
	 */
	public static Response ok(String message) {
		return Response.builder().success(true).code(HttpStatus.OK.value()).message(message).build();
	}

	/**
	 * 请求成功
	 * @param message 消息内容
	 * @return 响应结果
	 */
	public static Response ok(Object data) {
		return Response.builder().success(true).code(HttpStatus.OK.value()).data(data).build();
	}

	/**
	 * 请求成功
	 * @param message 消息提示
	 * @param data 消息内容
	 * @return 响应结果
	 */
	public static Response ok(String message, Object data) {
		return Response.builder().success(true).code(HttpStatus.OK.value()).data(data).message(message).build();
	}

	/**
	 * 请求失败
	 * @param message 错误提示
	 * @return 响应结果
	 */
	public static Response error(String message) {
		return Response.builder().success(false).code(HttpStatus.BAD_REQUEST.value()).message(message).build();
	}

	/**
	 * 请求失败
	 * @param code 错误码
	 * @param message 错误提示
	 * @return 响应结果
	 */
	public static Response error(int code, String message) {
		return Response.builder().success(false).code(code).message(message).build();
	}

	/**
	 * 请求失败
	 * @param code 错误码
	 * @param data 错误详情
	 * @return 响应结果
	 */
	public static Response error(int code, Object data) {
		return Response.builder().success(false).code(code).data(data).build();
	}

	/**
	 * 请求失败
	 * @param code 错误码
	 * @param message 错误提示
	 * @param data 错误详情
	 * @return 响应结果
	 */
	public static Response error(int code, String message, Object data) {
		return Response.builder().success(false).code(code).message(message).data(data).build();
	}

	/**
	 * 请求参数验证失败
	 * @param message 错误提示
	 * @return 响应结果
	 */
	public static Response validationError(String message) {
		message = StringUtils.defaultIfBlank(message, "参数验证错误");
		return Response.builder().success(false).code(HttpStatus.FOUND.value()).message(message).build();
	}

	/**
	 * 请求参数验证失败
	 * @param data 错误明细
	 * @return 响应结果
	 */
	public static Response validationError(Object data) {
		return Response.builder().success(false).code(HttpStatus.FOUND.value()).data(data).build();
	}

	/**
	 * 请求参数验证失败
	 * @param message 错误提示
	 * @param data 错误明细
	 * @return 响应结果
	 */
	public static Response validationError(String message, Object data) {
		return Response.builder().success(false).code(HttpStatus.FOUND.value()).data(data).message(message).build();
	}

}
