package com.api.core.model;

import com.api.core.entity.Provider;

public class MProvider {
	
	public MProvider(long providerId, String name, String street, String number, String neighborhood,
			String telephone) {
		super();
		this.providerId = providerId;
		this.name = name;
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.telephone = telephone;
	}
	
	public MProvider(Provider provider) {
		super();
		this.providerId = provider.getProviderId();
		this.name = provider.getName();
		this.street = provider.getStreet();
		this.number = provider.getNumber();
		this.neighborhood = provider.getNeighborhood();
		this.telephone = provider.getTelephone();
	}
	
	public MProvider() {
		
	}

	private long providerId;
	
	private String name;
	
	private String street;
	
	private String number;
	
	private String neighborhood;
	
	private String telephone;

	public long getProviderId() {
		return providerId;
	}

	public void setProviderId(long providerId) {
		this.providerId = providerId;
	}

	public String getName() {
		return name;
	}

	public void setnName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
