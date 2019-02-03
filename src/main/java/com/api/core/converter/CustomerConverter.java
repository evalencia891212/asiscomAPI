package com.api.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.core.entity.Costumer;
import com.api.core.model.MCostumer;

@Component("costumerConverter")
public class CustomerConverter {

	public List<MCostumer> ConvertirLista(List<Costumer> costumers){
		
		List<MCostumer> mcostumers = new ArrayList<>();
		
		for(Costumer costumer : costumers)
		{
			mcostumers.add(new MCostumer(costumer));
		}
		
		return mcostumers;
	}
	
}
