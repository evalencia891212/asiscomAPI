package com.api.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.core.entity.Provider;

@Repository("providerRepository")
public interface ProviderRepository extends JpaRepository <Provider,Serializable>{
	public abstract Provider findByProviderId(long providerId) ;
}
