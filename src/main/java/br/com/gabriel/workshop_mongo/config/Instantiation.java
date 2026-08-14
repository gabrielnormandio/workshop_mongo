package br.com.gabriel.workshop_mongo.config;

import br.com.gabriel.workshop_mongo.domain.Post;
import br.com.gabriel.workshop_mongo.domain.User;
import br.com.gabriel.workshop_mongo.repository.PostRepository;
import br.com.gabriel.workshop_mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    @Override
    public void run(String... args) throws Exception {

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.deleteAll();

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/03/2026"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
        Post post2 = new Post(null, sdf.parse("23/03/2026"), "Bom dia", "Acordei feliz hoje!", maria);

        postRepository.deleteAll();
        postRepository.saveAll(Arrays.asList(post1, post2));

    }
}
