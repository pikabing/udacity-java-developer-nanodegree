package com.demo.graphql.resolver;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graphql.entity.Dog;
import com.demo.graphql.repository.DogRepository;

import org.springframework.stereotype.Component;
import com.demo.graphql.exceptions.DogNotFoundException;

@Component
public class Query implements GraphQLQueryResolver {

    private DogRepository dogRepository;

    public Query(DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> findAllDogs() {
        return dogRepository.findAll();
    }

    public Dog findDogById(Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if (optionalDog.isPresent()) {
            return optionalDog.get();
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }
    
}