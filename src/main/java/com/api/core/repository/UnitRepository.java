package com.api.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.core.entity.Unit;

public interface UnitRepository extends JpaRepository <Unit,Serializable> {
	
	public abstract Unit findByUnitId(long unitId);

}
