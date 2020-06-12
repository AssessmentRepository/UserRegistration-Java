package com.userRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userRegistration.dto.UserDTO;
import com.userRegistration.model.User;
import com.userRegistration.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired(required = true)
	private UserRepository userRepository;

	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveOrUpdateUserById(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
