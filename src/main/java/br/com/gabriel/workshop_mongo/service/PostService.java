package br.com.gabriel.workshop_mongo.service;

import br.com.gabriel.workshop_mongo.domain.Post;
import br.com.gabriel.workshop_mongo.repository.PostRepository;
import br.com.gabriel.workshop_mongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }
}
