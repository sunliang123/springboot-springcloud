package com.fengmangbilu.microservice.finance.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL) 
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WxPayUnifiedOrderResponse {

	/**
	 * 返回状态码
	 */
	@XmlElement(name = "return_code")
	private String returnCode;
	/**
	 * 返回信息
	 */
	@XmlElement(name = "return_msg")
	private String returnMsg;

	// 当return_code为SUCCESS的时候，还会包括以下字段：

	/**
	 * 业务结果
	 */
	@XmlElement(name = "result_code")
	private String resultCode;
	/**
	 * 错误代码
	 */
	@XmlElement(name = "err_code")
	private String errCode;
	/**
	 * 错误代码描述
	 */
	@XmlElement(name = "err_code_des")
	private String errCodeDes;
	/**
	 * 公众账号ID
	 */
	@XmlElement(name = "appid")
	private String appid;
	/**
	 * 商户号
	 */
	@XmlElement(name = "mch_id")
	private String mchId;
	/**
	 * 服务商模式下的子公众账号ID
	 */
	@XmlElement(name = "sub_appid")
	private String subAppId;
	/**
	 * 服务商模式下的子商户号
	 */
	@XmlElement(name = "sub_mch_id")
	private String subMchId;
	/**
	 * 随机字符串
	 */
	@XmlElement(name = "nonce_str")
	private String nonceStr;
	/**
	 * 签名
	 */
	@XmlElement(name = "sign")
	private String sign;
	/**
	 * 微信生成的预支付回话标识，用于后续接口调用中使用，该值有效期为2小时
	 */
	@XmlElement(name = "prepay_id")
	private String prepayId;

	/**
	 * 交易类型，取值为：JSAPI，NATIVE，APP等
	 */
	@XmlElement(name = "trade_type")
	private String tradeType;

	/**
	 * mweb_url 支付跳转链接
	 */
	@XmlElement(name = "mweb_url")
	private String mwebUrl;

	/**
	 * trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付
	 */
	@XmlElement(name = "code_url")
	private String codeURL;

	public WxPayUnifiedOrderResponse() {
	}

	public String getPrepayId() {
		return prepayId;
	}

	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getMwebUrl() {
		return mwebUrl;
	}

	public void setMwebUrl(String mwebUrl) {
		this.mwebUrl = mwebUrl;
	}

	public String getCodeURL() {
		return codeURL;
	}

	public void setCodeURL(String codeURL) {
		this.codeURL = codeURL;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrCodeDes() {
		return errCodeDes;
	}

	public void setErrCodeDes(String errCodeDes) {
		this.errCodeDes = errCodeDes;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getSubAppId() {
		return subAppId;
	}

	public void setSubAppId(String subAppId) {
		this.subAppId = subAppId;
	}

	public String getSubMchId() {
		return subMchId;
	}

	public void setSubMchId(String subMchId) {
		this.subMchId = subMchId;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}