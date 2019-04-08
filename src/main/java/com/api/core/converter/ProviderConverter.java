package com.api.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.core.entity.Provider;
import com.api.core.model.MProvider;

@Component("providerConverter")
public class ProviderConverter {
	
	public List<MProvider> convertirLista(List<Provider> providerList){
		
		List<MProvider> mproviderList = new ArrayList<>();
		
		for(Provider provider : providerList)
		{
			mproviderList.add(new MProvider(provider));
		}
		
		return mproviderList;
		
	}
	
}
