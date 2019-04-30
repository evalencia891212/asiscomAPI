package com.api.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.core.converter.UserConverter;
import com.api.core.entity.User;
import com.api.core.model.MUser;
import com.api.core.repository.UserRepository;

@Service("userService")
public class UserService {
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("userConverter")
	private UserConverter userConverter;
	
	public boolean create(User user)
	{
		try {
			userRepository.save(user);
			return true;
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public List<MUser> findByName(String userName) {
		return userConverter.ConvertirLista(userRepository.findByUserName(userName));
	}
	
	public List<MUser> findAll(){
		return userConverter.ConvertirLista(userRepository.findAll());
	}
}
