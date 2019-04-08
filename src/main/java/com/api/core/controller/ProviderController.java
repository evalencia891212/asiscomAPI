package com.api.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.core.entity.Provider;
import com.api.core.model.MProvider;
import com.api.core.service.ProviderService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/v1")
public class ProviderController {
	
	@Autowired
	@Qualifier("providerService")
	ProviderService providerService;
	
	@PutMapping("/provider")
	public boolean createUnit(@RequestBody @Valid Provider provider)
	{
		return providerService.create(provider);
	}
	
	@GetMapping("/provider")
	public List<MProvider> getProviders(){
		return providerService.obtener();
	}

	@GetMapping("/provider/{providerId}")
	public MProvider getProvider(@PathVariable int providerId)
	{
		return providerService.buscarPorId(providerId);
	}
	
	@DeleteMapping("/provider/{providerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteProvider(@PathVariable int providerId) {
		providerService.borrar(providerId);
	}
	
}
