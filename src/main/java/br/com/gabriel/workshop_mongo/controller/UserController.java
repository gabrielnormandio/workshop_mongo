package br.com.gabriel.workshop_mongo.controller;


import br.com.gabriel.workshop_mongo.domain.User;
import br.com.gabriel.workshop_mongo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>();
        list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
