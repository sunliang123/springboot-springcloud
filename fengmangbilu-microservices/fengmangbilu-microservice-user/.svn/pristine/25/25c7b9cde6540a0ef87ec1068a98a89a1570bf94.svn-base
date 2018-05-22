package com.fengmangbilu.microservice.user.exceptions;

@SuppressWarnings("serial")
public class UserException extends RuntimeException {

	public static UserException ERR_MOBILE_NOT_FOUND = new UserException(ErrorCode.ERR_MOBILE_NOT_FOUND);
	public static UserException ERR_MOBILE_DUPLICATE = new UserException(ErrorCode.ERR_MOBILE_DUPLICATE);
	public static UserException ERR_MOBILE_FORMAT = new UserException(ErrorCode.ERR_MOBILE_FORMAT);
	public static UserException ERR_MOBILE_IS_BLANK = new UserException(ErrorCode.ERR_MOBILE_IS_BLANK);
	public static UserException ERR_SMS_CODE = new UserException(ErrorCode.ERR_SMS_CODE);
	public static UserException ERR_SMS_CODE_IS_BLANK = new UserException(ErrorCode.ERR_SMS_CODE_IS_BLANK);
	public static UserException ERR_SMS_LIMIT_CONTROL = new UserException(ErrorCode.ERR_SMS_LIMIT_CONTROL);
	public static UserException ERR_PASSWORD_FORMAT = new UserException(ErrorCode.ERR_PASSWORD_FORMAT);
	public static UserException ERR_PASSWORD_IS_BLANK = new UserException(ErrorCode.ERR_PASSWORD_IS_BLANK);
	public static UserException ERR_PASSWORD_INCORRECT = new UserException(ErrorCode.ERR_PASSWORD_INCORRECT);
	public static UserException ERR_FILE_SIZE = new UserException(ErrorCode.ERR_FILE_SIZE);
	public static UserException ERR_FILE_TYPE = new UserException(ErrorCode.ERR_FILE_TYPE);
	public static UserException ERR_FILE_IS_EMPTY = new UserException(ErrorCode.ERR_FILE_IS_EMPTY);
	public static UserException ERR_UNKNOW = new UserException(ErrorCode.ERR_MOBILE_NOT_FOUND);
	
	public static UserException ERR_ID_NAME_IS_BLANK = new UserException(ErrorCode.ERR_ID_NAME_IS_BLANK);
	public static UserException ERR_ID_NAME_FORMAT = new UserException(ErrorCode.ERR_ID_NAME_FORMAT);
	public static UserException ERR_ID_NUMBER_IS_BLANK = new UserException(ErrorCode.ERR_ID_NUMBER_IS_BLANK);
	public static UserException ERR_ID_NUMBER_FORMAT = new UserException(ErrorCode.ERR_ID_NUMBER_FORMAT);
	public static UserException ERR_ID_ADDRESS_IS_BLANK = new UserException(ErrorCode.ERR_ID_ADDRESS_IS_BLANK);
	public static UserException ERR_ID_ISSUED_IS_BLANK = new UserException(ErrorCode.ERR_ID_ISSUED_IS_BLANK);
	public static UserException ERR_ID_ISSUEDDATA_IS_BLANK = new UserException(ErrorCode.ERR_ID_ISSUEDDATA_IS_BLANK);
	public static UserException ERR_ID_VALIDDATE_IS_BLANK = new UserException(ErrorCode.ERR_ID_VALIDDATE_IS_BLANK);
	public static UserException ERR_ID_NATION_IS_BLANK = new UserException(ErrorCode.ERR_ID_NATION_IS_BLANK);
	public static UserException ERR_ID_FRONT_IS_BLANK = new UserException(ErrorCode.ERR_ID_FRONT_IS_BLANK);
	public static UserException ERR_ID_BACK_IS_BLANK = new UserException(ErrorCode.ERR_ID_BACK_IS_BLANK);
	public static UserException ERR_ID_HEAD_IS_BLANK = new UserException(ErrorCode.ERR_ID_HEAD_IS_BLANK);
	public static UserException ERR_ID_DUPLICATION = new UserException(ErrorCode.ERR_ID_DUPLICATION);
	public static UserException ERR_ID_INCORRECT = new UserException(ErrorCode.ERR_ID_INCORRECT);

	private ErrorCode errorCode;

	protected UserException() {
		this(null);
	}

	public UserException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public String getName() {
		return errorCode.name();
	}

	public int getCode() {
		return errorCode.getCode();
	}

	public String getMessage() {
		return errorCode.getMessage();
	}

	public static int getCode(String error) {
		return ErrorCode.valueOf(error).getCode();
	}

	public static String getMessage(String error) {
		return ErrorCode.valueOf(error).getMessage();
	}

	private enum ErrorCode {

		ERR_MOBILE_NOT_FOUND(10000, "该手机号尚未注册"),
		ERR_MOBILE_DUPLICATE(10001, "该手机号已经注册"),
		ERR_MOBILE_FORMAT(10002, "手机号格式错误"),
		ERR_MOBILE_IS_BLANK(10003, "手机号不能为空"),

		ERR_SMS_CODE(10010, "验证码错误"),
		ERR_SMS_CODE_IS_BLANK(10011, "验证码错误"),
		ERR_SMS_LIMIT_CONTROL(10012, "验证码发送频率过高，请稍后再试"),

		ERR_PASSWORD_FORMAT(10020, "密码必须包含数字、字母、长度不低于6位"),
		ERR_PASSWORD_IS_BLANK(10021, "密码不能为空"),
		ERR_PASSWORD_INCORRECT(10022, "帐号或密码错误"),

		ERR_FILE_SIZE(10030, "图片需小于2M"),
		ERR_FILE_TYPE(10031, "图片格式不正确"),
		ERR_FILE_IS_EMPTY(10032, "请选择需要上传的图片"),

		ERR_ID_NAME_IS_BLANK(10040, "姓名不能为空"),
		ERR_ID_NAME_FORMAT(10041, "姓名格式不正确"),
		ERR_ID_NUMBER_IS_BLANK(10042, "身份证不能为空"),
		ERR_ID_NUMBER_FORMAT(10043, "身份证格式不正确"),
		ERR_ID_ADDRESS_IS_BLANK(10044, "未识别到原籍地址，请重新上传"),
		ERR_ID_ISSUED_IS_BLANK(10045, "未识别到签发机关，请重新上传"),
		ERR_ID_ISSUEDDATA_IS_BLANK(10046, "未识别到开始期限，请重新上传"),
		ERR_ID_VALIDDATE_IS_BLANK(10047, "未识别到结束期限，请重新上传"),
		ERR_ID_NATION_IS_BLANK(10048, "未识别到名族，请重新上传"),
		ERR_ID_FRONT_IS_BLANK(10049, "未识别到身份证正面，请重新上传"),
		ERR_ID_BACK_IS_BLANK(10050, "未识别到身份证反面，请重新上传"),
		ERR_ID_HEAD_IS_BLANK(10051, "未识别到身份证头像，请重新上传"),
		ERR_ID_DUPLICATION(10052, "您已经完成个人实名认证，请勿重复认证"),
		ERR_ID_INCORRECT(10053, "个人实名认证失败，请稍后重试"),

		ERR_UNKNOW(10099, "未知错误");

		private int code;

		private String message;

		private ErrorCode(int code, String message) {
			this.code = code;
			this.message = message;
		}

		public int getCode() {
			return code;
		}

		public String getMessage() {
			return message;
		}
	}

}
