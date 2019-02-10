package com.api.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cat_unidades_medida")
@Entity
public class Unit {
	
	
	public Unit() {
		
	}
	
	public Unit(long unitId, String name, String pluralName, String prefix, int active) {
		super();
		this.unitId = unitId;
		this.name = name;
		this.pluralName = pluralName;
		this.prefix = prefix;
		this.active = active;
	}

	@GeneratedValue
	@Id
	@Column(name="id_unidad")
	private long unitId;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "nombre_plural")
	private String pluralName;
	
	@Column(name = "prefijo")
	private String prefix;
	
	@Column(name = "activo")
	private int active;

	public long getUnitId() {
		return unitId;
	}

	public void setUnitId(long unitId) {
		this.unitId = unitId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPluralName() {
		return pluralName;
	}

	public void setPluralName(String pluralName) {
		this.pluralName = pluralName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
	
	
}
