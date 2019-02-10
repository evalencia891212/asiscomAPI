package com.api.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.core.entity.Unit;
import com.api.core.model.MUnit;

@Component("unitConverter")
public class UnitConverter {
	
	public List<MUnit> convertirLista(List<Unit> units)
	{
		List<MUnit> munits = new ArrayList<>();
		for(Unit unit : units)
		{
			munits.add(new MUnit(unit));
		}
		return munits;
		
	}
}
