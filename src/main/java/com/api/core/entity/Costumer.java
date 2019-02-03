package com.api.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cat_clientes")
@Entity
public class Costumer {
	
	
	
	public Costumer(long costumerId, String key, String firstName, String lastName, String surname,
			String businessName) {
		super();
		this.costumerId = costumerId;
		this.key = key;
		this.firstName = firstName;
		this.lastName = lastName;
		this.surname = surname;
		this.businessName = businessName;
	}
	
	public Costumer() {
		
	}


	@GeneratedValue
	@Id
	@Column(name="id_cliente")
	private long costumerId;
	
	@Column(name="codigo")
	private String key;
	
	@Column(name="name")
	private String firstName;
	
	@Column(name="apellido_paterno")
	private String lastName;
	
	@Column(name="apellido_materno")
	private String surname;
	
	@Column(name="razon_social")
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
