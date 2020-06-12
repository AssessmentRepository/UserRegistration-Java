package com.userRegistration.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.userRegistration.model.User;
@Repository
public interface LoginRepository extends MongoRepository<User, String>{

}
