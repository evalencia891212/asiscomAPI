package com.api.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.core.converter.ProviderConverter;
import com.api.core.entity.Provider;
import com.api.core.model.MProvider;
import com.api.core.repository.ProviderRepository;


@Service("providerService")
public class ProviderService {
	
	@Autowired
	@Qualifier("providerRepository")
	private ProviderRepository providerRepository;
	
	@Autowired
	@Qualifier("providerConverter")
	private ProviderConverter providerConverter;
	
	
	public boolean create(Provider provider)
	{
		try {
			providerRepository.save(provider);
			return true;
		}catch(Exception ex)
		{
			return false;
		}
		
	}
	
	public List<MProvider> obtener(){
		return providerConverter.convertirLista(providerRepository.findAll());
	}
	
	public MProvider buscarPorId(long providerId)
	{
		return new MProvider(providerRepository.findByProviderId(providerId));
	}
	
	public boolean borrar(long providerId)
	{
		try{
			Provider provider = providerRepository.findByProviderId(providerId);
			providerRepository.delete(provider);
			return true;
		}catch(Exception ex)
		{
			return false;
		}
	}

}
