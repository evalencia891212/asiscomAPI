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

import com.api.core.entity.Unit;
import com.api.core.entity.User;
import com.api.core.model.MCostumer;
import com.api.core.model.MUnit;
import com.api.core.service.UnitService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/v1")
public class UnitController {

	@Autowired
	@Qualifier("unitService")
	UnitService unitService;
	
	@PutMapping("/unit")
	public boolean createUnit(@RequestBody @Valid Unit unit)
	{
		return unitService.create(unit);
	}
	
	@GetMapping("/unit")
	public List<MUnit> getUnits()
	{
		return unitService.obtener();
	}
	
	@GetMapping("/unit/{unitId}")
	public MUnit getUnit(@PathVariable int unitId)
	{
		return unitService.buscarPorId(unitId);
	}
	
	@DeleteMapping("/unit/{unitId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUnit(@PathVariable int unitId) {
		unitService.borrar(unitId);
	}
	
	
}
