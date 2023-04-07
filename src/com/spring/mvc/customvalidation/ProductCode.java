package com.spring.mvc.customvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ProductCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ProductCode {
	
	//define default product code
	public String value() default "PRD";
	
	//define default error message
	public String message() default "must start with PRD";
	
	//define default group
	public Class<?>[]  groups() default{};
	
	//define default payloads - additional information about validation
	public Class<? extends Payload>[]  payload() default{};
	
	

}
