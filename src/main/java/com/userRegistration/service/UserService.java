package com.userRegistration.service;

import java.util.List;

import com.userRegistration.dto.UserDTO;
import com.userRegistration.model.User;

public interface UserService {
	boolean createUser(User user);
	User getUserById(String userId);
	List<User> listAllUsers();
	boolean saveOrUpdateUserById(UserDTO userDTO);
	boolean deleteUserById(Integer userId);	
}
