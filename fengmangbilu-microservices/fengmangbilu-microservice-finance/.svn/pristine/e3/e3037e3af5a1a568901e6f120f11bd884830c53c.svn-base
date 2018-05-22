package com.fengmangbilu.microservice.finance.enums;

/***
 * 发票类型
 */
public enum InvoiceType {

	ORDINARY("增值税普通发票"), SPECIAL("增值税专用发票");

	private String name;

	private InvoiceType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static InvoiceType getEnum(int ordinal) {
		InvoiceType result = null;
		InvoiceType[] enums = InvoiceType.values();
		for (int i = 0; i < enums.length; i++) {
			if (enums[i].ordinal() == ordinal) {
				result = enums[i];
				break;
			}
		}
		return result;
	}

}
