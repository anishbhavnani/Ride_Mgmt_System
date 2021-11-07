package com.driver.register.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.springframework.context.annotation.PropertySource;


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=MobileNumberValidator.class)
@PropertySource("classpath:message.properties")
public @interface ValidMobile {
	
	
	String message() default "{driver.mobile.invalid}";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
