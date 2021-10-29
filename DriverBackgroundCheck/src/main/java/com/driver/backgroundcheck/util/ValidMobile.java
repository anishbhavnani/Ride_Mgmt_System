package com.driver.backgroundcheck.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=MobileNumberValidator.class)
public @interface ValidMobile {
	
	
	String message() default "Invalid mobile number";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
