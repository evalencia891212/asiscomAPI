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

import com.api.core.entity.Costumer;
import com.api.core.entity.User;
import com.api.core.model.MCostumer;
import com.api.core.model.MUser;
import com.api.core.service.CostumerService;
import com.api.core.service.UserService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/v1")
public class CustomerController {
	
	@Autowired
	@Qualifier("customerService")
	CostumerService customerService;
	
	@PutMapping("/customer")
	public boolean createCustomer(@RequestBody @Valid Costumer costumer)
	{
		return customerService.create(costumer);
	}
	
	@GetMapping("/customer")
	public List<MCostumer> getCustom()
	{
		return customerService.obtener();
	}
	
	@GetMapping("/customer/{customerId}")
	public MCostumer getCustomerById(@PathVariable int customerId)
	{
		return customerService.ObtenerPorId(customerId);
	}
	
	@DeleteMapping("/customer/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable int customerId) {	
		customerService.borrar(customerId);
	}
	
}
