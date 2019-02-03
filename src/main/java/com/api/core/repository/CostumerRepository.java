package com.api.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.core.entity.Costumer;

@Repository("costumerRepository")
public interface CostumerRepository extends JpaRepository <Costumer,Serializable>{
	
	public abstract Costumer findByCostumerId(long CostumerId);

}
