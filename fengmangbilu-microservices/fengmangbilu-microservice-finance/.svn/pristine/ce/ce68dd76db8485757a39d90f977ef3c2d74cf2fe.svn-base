package com.fengmangbilu.microservice.finance.enums;

/**
 * 审核状态
 */
public enum AuditStatus {

	AUDITING("审核中"), FAIL("审核不通过"), SUCCESS("审核通过");

	private String name;

	private AuditStatus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static AuditStatus getEnum(int ordinal) {
		AuditStatus result = null;
		AuditStatus[] enums = AuditStatus.values();
		for (int i = 0; i < enums.length; i++) {
			if (enums[i].ordinal() == ordinal) {
				result = enums[i];
				break;
			}
		}
		return result;
	}
}
