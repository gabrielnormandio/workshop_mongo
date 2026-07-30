package br.com.gabriel.workshop_mongo.repository;

import br.com.gabriel.workshop_mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
