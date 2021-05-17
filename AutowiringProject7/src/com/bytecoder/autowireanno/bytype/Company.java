package com.bytecoder.autowireanno.bytype;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import com.sun.tracing.dtrace.NameAttributes;

public class Company 
{
	/* @Resource(name="product2") */
/*	@Qualifier(value ="product3")*/
	private Product product;

	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}


}
