package com.mark.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mark.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
