package com.userRegistration.service;

import java.util.List;

import com.userRegistration.model.User;

public interface AdminService {
	List<User> listAllUsers();
	boolean deleteUserById(int userId);
}
