package com.fengmangbilu.microservice.oa.exceptions;

public class CompanyException extends RuntimeException {

	private static final long serialVersionUID = -7293605442489442252L;
	
	public static CompanyException UNAUTHORIZED = new CompanyException(13200,"未企业认证");
	public static CompanyException NO_DATA = new CompanyException(13201,"未找到相关数据");
	public static CompanyException AUDIT_COMPLETED = new CompanyException(13202,"企业审核已经完成");
	public static CompanyException AUDIT_SUCCESS = new CompanyException(13203,"企业审核已通过");
	public static CompanyException AUDIT_NOT_COMPLETED = new CompanyException(13204,"企业认证审核中，请耐心等待");
	public static CompanyException HAS_STAFF = new CompanyException(13205,"该部门有员工数据，无法删除");
	public static CompanyException TIMEOUT = new CompanyException(13206,"请求超时");
	public static CompanyException UNKNOW_DEPT = new CompanyException(13207,"部门不存在");
	public static CompanyException UNKNOW_COMPANY = new CompanyException(13208,"您未加入任何企业");
	public static CompanyException HAS_COMPANY = new CompanyException(13209,"该用户在职状态无法录取");
	public static CompanyException UNKNOW_USER = new CompanyException(13210,"该用户尚未注册");

	private int code;

	public CompanyException(int code) {
		super();
		this.code = code;
	}

	public CompanyException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
