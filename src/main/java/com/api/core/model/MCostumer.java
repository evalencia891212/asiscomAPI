package com.api.core.model;

import com.api.core.entity.Costumer;

public class MCostumer {
	
	public MCostumer(Costumer costumer) {
		super();
		this.costumerId = costumer.getCostumerId();
		this.key = costumer.getKey();
		this.firstName = costumer.getFirstName();
		this.lastName = costumer.getLastName();
		this.surname = costumer.getSurname();
		this.businessName = costumer.getBusinessName();
	}
	
    public MCostumer(long costumerId, String key, String firstName, String lastName, String surname,
			String businessName) {
		super();
		this.costumerId = costumerId;
		this.key = key;
		this.firstName = firstName;
		this.lastName = lastName;
		this.surname = surname;
		this.businessName = businessName;
	}
    
    public MCostumer() {
		
	}

	private long costumerId;
	
	private String key;
	
	private String firstName;
	
	private String lastName;
	
	private String surname;
	
	private String businessName;

	public long getCostumerId() {
		return costumerId;
	}

	public void setCostumerId(long costumerId) {
		this.costumerId = costumerId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	

}
