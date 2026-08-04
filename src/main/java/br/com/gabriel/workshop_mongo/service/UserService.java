package br.com.gabriel.workshop_mongo.service;

import br.com.gabriel.workshop_mongo.domain.User;
import br.com.gabriel.workshop_mongo.dto.UserDTO;
import br.com.gabriel.workshop_mongo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id).orElse(null);
    }
}
