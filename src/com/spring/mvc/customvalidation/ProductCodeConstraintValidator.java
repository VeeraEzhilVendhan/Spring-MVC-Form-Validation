package com.spring.mvc.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductCodeConstraintValidator 
          implements ConstraintValidator<ProductCode, String>{
	
	public String productPrefix;

	@Override
	public boolean isValid(String pcode, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result=false;;
		
		if(pcode!=null)
		{
			result=pcode.startsWith(productPrefix);
		}
		else
		{
			result=true;
		}
		
		
		return result;
	}

	@Override
	public void initialize(ProductCode productcode) {
		
		productPrefix=productcode.value();
		
	}



}
