package com.fengmangbilu.microservice.user.endpoints;

import com.fengmangbilu.microservice.user.constraints.IdCardRequestConstraint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@IdCardRequestConstraint
public class IdCardRequest {

	private String name;

	private String idCard;
	
	private String mobile;

	private String OriginalAddress;

	private String idIssued;

	private String issuedData;

	private String validDate;

	private String nation;

	private String frontImage;

	private String backImage;

	private String headImage;
}
