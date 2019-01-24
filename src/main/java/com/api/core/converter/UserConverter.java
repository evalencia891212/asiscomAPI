package com.api.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.core.entity.User;
import com.api.core.model.MUser;

@Component("userConverter")
public class UserConverter {
	
	public List<MUser> ConvertirLista(List<User> users)
	{
		List<MUser> musers = new ArrayList<>();
		for(User user : users)
		{
			musers.add(new MUser(user));
		}
		return musers;
	}

}
