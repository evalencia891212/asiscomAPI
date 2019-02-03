package com.api.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.core.converter.CustomerConverter;
import com.api.core.entity.Costumer;
import com.api.core.model.MCostumer;
import com.api.core.repository.CostumerRepository;


@Service("customerService")
public class CostumerService {
	
	@Autowired
	@Qualifier("costumerRepository")
	private CostumerRepository costumerRepository;
	
	@Autowired
	@Qualifier("costumerConverter")
	private CustomerConverter costumerConverter;
	
	public boolean create(Costumer costumer)
	{
		try {
			costumerRepository.save(costumer);
			return true;
		}catch(Exception e) {
			return false;
		}	
	}
	
	public boolean borrar(long costumerId) {
		try {
			Costumer costumer =costumerRepository.findByCostumerId(costumerId);
			costumerRepository.delete(costumer);
			return true;
		}catch(Exception e)
		{
			return false;
		}
   }
	
	 public List<MCostumer> obtener(){
		   return costumerConverter.ConvertirLista(costumerRepository.findAll());
	   }
	 
	 public MCostumer ObtenerPorId(long costumerId) {
		 return new MCostumer(costumerRepository.findByCostumerId(costumerId));
	 }
	
}
