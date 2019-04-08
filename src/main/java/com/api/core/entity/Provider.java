package com.api.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cat_proveedores")
@Entity
public class Provider {
	
	public Provider(long providerId, String name, String street, String number, String neighborhood,
			String telephone) {
		super();
		this.providerId = providerId;
		this.name = name;
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.telephone = telephone;
	}
	
	public Provider() {
			
	}

	@GeneratedValue
	@Id
	@Column(name="id_proveedor")
	private long providerId;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="calle")
	private String street;
	
	@Column(name="numero")
	private String number;
	
	@Column(name="colonia")
	private String neighborhood;
	
	@Column(name="telefono")
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

	public void setName(String name) {
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
