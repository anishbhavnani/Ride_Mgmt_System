package com.driver.backgroundcheck.util;

import java.math.BigInteger;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileNumberValidator implements ConstraintValidator<ValidMobile,Object> {

	private String regex="\\d{10}";
	@Override
	public boolean isValid(Object mobile, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(String.valueOf(mobile)==null || String.valueOf(mobile).length()<10)
			return false;
		Pattern pat=Pattern.compile(regex);		
		return pat.matcher(mobile.toString()).matches();
	}

}
