package com.bytecoder.autowireanno.bytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company 
{
	@Autowired(required = false)
	//@Qualifier(value ="product3")
	private Product product;

	public Product getProduct() {
		return product;
	}
    
	public void setProduct(Product product) {
		this.product = product;
	}


}
