package com.fengmangbilu.microservice.oa.exceptions;

public class UploadException extends RuntimeException {
	private static final long serialVersionUID = 3914685769444316291L;
	public static UploadException ERROR_FILE_SIZE = new UploadException(13100,"文件大小不正确");
	public static UploadException ERROR_FILE_TYPE = new UploadException(13101,"文件格式不正确");
	public static UploadException ERROR_FILE_EMPTY = new UploadException(13102,"请选择文件");

	private int code;

	public UploadException(int code) {
		super();
		this.code = code;
	}

	public UploadException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
