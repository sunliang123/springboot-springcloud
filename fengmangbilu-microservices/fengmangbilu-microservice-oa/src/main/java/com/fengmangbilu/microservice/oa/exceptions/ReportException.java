package com.fengmangbilu.microservice.oa.exceptions;

public class ReportException extends RuntimeException {

	private static final long serialVersionUID = 9181535536991096192L;

	public static final int DEFAULT_CODE = 13099;

	public static ReportException ARGUMENT_NOT_VALID = new ReportException(13011, "请求参数错误");
	public static ReportException SERVICE = new ReportException(13012, "请求服务异常");
	public static ReportException CONDITION = new ReportException(13013, "请求参数转换异常");
	public static ReportException CONNECT = new ReportException(13014, "请求连接超时");
	public static ReportException RESULT = new ReportException(13015, "请求结果转换异常");
	public static ReportException UNZIP = new ReportException(13016, "请求结果解压异常");
	public static ReportException IDCARD_DIFFER = new ReportException(13017, "公民身份号码一致,姓名不一致");
	public static ReportException IDCARD_UNFOUND = new ReportException(13018, "库中无此号,请到户籍所在地进行核实");
	public static ReportException ENCRYPT = new ReportException(13019, "接口加密异常");
	public static ReportException SIGN = new ReportException(13020, "接口签名异常");
	public static ReportException API = new ReportException(13021, "接口访问异常");
	public static ReportException UNCERTIFIED = new ReportException(13022, "未实名认证");
	public static ReportException UNKNOW_DEPT = new ReportException(13023, "招聘部门不存在");
	public static ReportException UNKNOW_COMPANY = new ReportException(13024, "邀请单位不存在");
	public static ReportException REPEAT_PUSH = new ReportException(13025, "邀请单位重复推送");
	public static ReportException UNKNOW_REPORT = new ReportException(13026, "报告不存在");
	public static ReportException OTHER = new ReportException(DEFAULT_CODE, "未定义异常");

	private int code;

	public ReportException(int code) {
		super();
		this.code = code;
	}

	public ReportException(int code, String message) {
		super(message);
		this.code = code;
	}

	public ReportException(String message) {
		super(message);
		this.code = DEFAULT_CODE;
	}

	public int getCode() {
		return code;
	}
}
