package com.api.core.model;

import com.api.core.entity.Unit;

public class MUnit {
	
	public MUnit(Unit mesureUnit) {
		this.unitId = mesureUnit.getUnitId();
		this.name = mesureUnit.getName();
		this.pluralName = mesureUnit.getPluralName();
		this.prefix = mesureUnit.getPrefix();
		this.active = mesureUnit.getActive();
	}
	
	public MUnit(long unitId, String name, String pluralName, String prefix, int active) {
		super();
		this.unitId = unitId;
		this.name = name;
		this.pluralName = pluralName;
		this.prefix = prefix;
		this.active = active;
	}
	
	public MUnit() {
		
	}

	private long unitId;
	
	private String name;
	
	private String pluralName;
	
	private String prefix;
	
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
