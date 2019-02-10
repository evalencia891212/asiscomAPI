package com.api.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Table(name="cat_productos")
//@Entity
public class Product {
	
	
	private long productId;
	
	private long priceListId;
	
	private long costListId;
	
	private long mesureUnitId;
	
	private String key;
	
	private String name;
	
	private String factureName;
	
	private String barCode;
	
	private String registerDate;
	
	private int active;
	
	private long providerId;
	
	private double contPrice;
	
	private double creditPrice;
	
	

}
