package com._17od.upm.database;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPasswordDB extends MongoRepository<LoginToken, String>{
	
	public LoginToken findById(String id);
    public List<LoginToken> findByUsername(String username);

}
