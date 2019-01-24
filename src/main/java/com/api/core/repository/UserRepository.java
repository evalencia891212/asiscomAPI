package com.api.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.core.entity.User;

public interface UserRepository extends JpaRepository <User,Serializable>{
	
	public abstract List<User> findByUserName(String name);

}
