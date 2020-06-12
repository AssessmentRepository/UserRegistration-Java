package com.userRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userRegistration.model.User;
import com.userRegistration.repo.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired(required = true)
	private AdminRepository adminRepository;

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return false;
	}


}
