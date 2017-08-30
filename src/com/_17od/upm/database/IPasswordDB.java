package com._17od.upm.database;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "logins", path = "logins")
public interface IPasswordDB extends MongoRepository<LoginToken, String>{  

    List<LoginToken> findByUsername(@Param("username") String username);

}
