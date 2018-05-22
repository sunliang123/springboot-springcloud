package com.fengmangbilu.microservice.user.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.fengmangbilu.microservice.user.endpoints.IdCardRequest;
import com.fengmangbilu.microservice.user.exceptions.UserException;
import com.fengmangbilu.util.IdCardUtils;
import com.fengmangbilu.util.RegexUtils;

public class IdCardRequestValidator implements ConstraintValidator<IdCardRequestConstraint, IdCardRequest> {

	@Override
	public void initialize(final IdCardRequestConstraint constraintAnnotation) {
	}

	@Override
	public boolean isValid(IdCardRequest request, ConstraintValidatorContext context) {
		String name = request.getName();
		if (!StringUtils.hasText(name)) {
			return createSingleConstraintViolation(context, "name", UserException.ERR_ID_NAME_IS_BLANK.getName());
		}
		if (!RegexUtils.isName(name)) {
			return createSingleConstraintViolation(context, "name", UserException.ERR_ID_NAME_FORMAT.getName());
		}
		String idCard = request.getIdCard();
		if (!StringUtils.hasText(idCard)) {
			return createSingleConstraintViolation(context, "idCard", UserException.ERR_ID_NUMBER_IS_BLANK.getName());
		}
		if (!IdCardUtils.validateCard(idCard)) {
			return createSingleConstraintViolation(context, "idCard", UserException.ERR_ID_NUMBER_FORMAT.getName());
		}
		String OriginalAddress = request.getOriginalAddress();
		if (!StringUtils.hasText(OriginalAddress)) {
			return createSingleConstraintViolation(context, "OriginalAddress", UserException.ERR_ID_ADDRESS_IS_BLANK.getName());
		}
		String idIssued = request.getIdIssued();
		if (!StringUtils.hasText(idIssued)) {
			return createSingleConstraintViolation(context, "idIssued", UserException.ERR_ID_ISSUED_IS_BLANK.getName());
		}
		String issuedData = request.getIssuedData();
		if (!StringUtils.hasText(issuedData)) {
			return createSingleConstraintViolation(context, "issuedData", UserException.ERR_ID_ISSUEDDATA_IS_BLANK.getName());
		}
		String validDate = request.getValidDate();
		if (!StringUtils.hasText(validDate)) {
			return createSingleConstraintViolation(context, "validDate", UserException.ERR_ID_VALIDDATE_IS_BLANK.getName());
		}
		String nation = request.getNation();
		if (!StringUtils.hasText(nation)) {
			return createSingleConstraintViolation(context, "nation", UserException.ERR_ID_NATION_IS_BLANK.getName());
		}
		String frontImage = request.getFrontImage();
		if (!StringUtils.hasText(frontImage)) {
			return createSingleConstraintViolation(context, "frontImage", UserException.ERR_ID_FRONT_IS_BLANK.getName());
		}
		String backImage =request.getBackImage();
		if (!StringUtils.hasText(backImage)) {
			return createSingleConstraintViolation(context, "backImage", UserException.ERR_ID_BACK_IS_BLANK.getName());
		}
		String headImage = request.getHeadImage(); 
		if (!StringUtils.hasText(headImage)) {
			return createSingleConstraintViolation(context, "headImage", UserException.ERR_ID_HEAD_IS_BLANK.getName());
		}
		
		return true;
	}

	protected boolean createSingleConstraintViolation(ConstraintValidatorContext context, String name, String message) {
		context.buildConstraintViolationWithTemplate(message).addPropertyNode(name).addConstraintViolation();
		return false;
	}
}
