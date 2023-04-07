package com.spring.mvc.validation;

import javax.validation.constraints.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.spring.mvc.customvalidation.ProductCode;

public class Customer {
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String firstName;
	
	private String lastName;
	
	//number validation
	@NotNull(message="is required")
	@Min(value=0,message="id value must be greater than or equal to 0")
	@Max(value=10,message="id value must be less than or equal to 10")
	private Integer id;
	
	//regular expression
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="postal code must be 5 digits either characters or digits")
	private String postalcode;
	
	@ProductCode(value="AMZN",message="must start with AMZN")
	private String productCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
}
