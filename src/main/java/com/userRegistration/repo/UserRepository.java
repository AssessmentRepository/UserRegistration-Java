package com.userRegistration.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.userRegistration.model.User;
@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

}
