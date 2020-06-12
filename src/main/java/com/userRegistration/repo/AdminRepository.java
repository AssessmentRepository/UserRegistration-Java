package com.userRegistration.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.userRegistration.model.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, Integer> {
	
}
