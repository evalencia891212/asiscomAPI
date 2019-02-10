package com.api.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.core.converter.UnitConverter;
import com.api.core.entity.Unit;
import com.api.core.model.MUnit;
import com.api.core.repository.UnitRepository;

@Service("unitService")
public class UnitService {
	
	@Autowired
	@Qualifier("unitRepository")
	private UnitRepository unitRepository;
	
	@Autowired
	@Qualifier("unitConverter")
	private UnitConverter unitConverter;
	
	public boolean create(Unit unit)
	{
		try {
			unitRepository.save(unit);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
	public MUnit buscarPorId(long unitId)
	{
		return new MUnit(unitRepository.findByUnitId(unitId));
	}
	
}
