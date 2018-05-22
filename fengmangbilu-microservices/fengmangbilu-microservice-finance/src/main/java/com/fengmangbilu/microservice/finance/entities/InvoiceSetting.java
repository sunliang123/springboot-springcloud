package com.fengmangbilu.microservice.finance.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fengmangbilu.domain.BaseEntity;
import com.fengmangbilu.microservice.finance.enums.AuditStatus;
import com.fengmangbilu.microservice.finance.enums.InvoiceType;

/**
 * 发票信息设置
 */
@Entity
@Table(name = "fengmangbilu_invoice_setting")
public class InvoiceSetting extends BaseEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	/** 发票抬头 **/
	private String title;

	/** 税务登记证号 **/
	private String taxRegisterNo;

	/** 发票类型 **/
	@Enumerated(EnumType.ORDINAL)
	private InvoiceType type;

	/** 开户许可证上的开户银行 */
	private String bank;

	/** 开户许可证上的银行账号 **/
	private String bankNo;

	/** 营业执照上的注册地址 **/
	private String operatingLicenseAddress;

	/** 营业执照上的注册固定电话 **/
	private String operatingLicensePhone;
	
	/** 审核状态 **/
	@Enumerated(EnumType.ORDINAL)
	private AuditStatus status;
	
	/** 审核失败原因 **/
	private String reason;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaxRegisterNo() {
		return taxRegisterNo;
	}

	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getOperatingLicenseAddress() {
		return operatingLicenseAddress;
	}

	public void setOperatingLicenseAddress(String operatingLicenseAddress) {
		this.operatingLicenseAddress = operatingLicenseAddress;
	}

	public String getOperatingLicensePhone() {
		return operatingLicensePhone;
	}

	public void setOperatingLicensePhone(String operatingLicensePhone) {
		this.operatingLicensePhone = operatingLicensePhone;
	}

	public AuditStatus getStatus() {
		return status;
	}

	public void setStatus(AuditStatus status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public InvoiceType getType() {
		return type;
	}

	public void setType(InvoiceType type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
