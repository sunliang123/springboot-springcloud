package com.fengmangbilu.microservice.finance.endpoints;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fengmangbilu.microservice.finance.constraints.InvoiceSettingConstraint;
import com.fengmangbilu.microservice.finance.enums.AuditStatus;
import com.fengmangbilu.microservice.finance.enums.InvoiceType;

@InvoiceSettingConstraint
public class InvoiceSettingRequest {

	private String title;

	private String taxRegisterNo;
	
	private InvoiceType type = InvoiceType.ORDINARY;

	private String bank;

	private String bankNo;

	private String operatingLicenseAddress;

	private String operatingLicensePhone;
	
	private AuditStatus status = AuditStatus.SUCCESS;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTaxRegisterNo() {
		return taxRegisterNo;
	}

	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
	}

	public InvoiceType getType() {
		return type;
	}

	public void setType(InvoiceType type) {
		this.type = type;
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
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
}
