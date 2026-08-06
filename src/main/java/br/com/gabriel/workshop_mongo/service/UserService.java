package br.com.gabriel.workshop_mongo.service;

import br.com.gabriel.workshop_mongo.domain.User;
import br.com.gabriel.workshop_mongo.dto.UserDTO;
import br.com.gabriel.workshop_mongo.repository.UserRepository;
import br.com.gabriel.workshop_mongo.service.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }
}
