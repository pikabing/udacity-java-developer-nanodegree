package com.demo.graphql.mutator;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graphql.entity.Dog;
import com.demo.graphql.repository.DogRepository;
import com.demo.graphql.exceptions.*;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    
    private DogRepository dogRepository;

    public Mutation(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public boolean deleteDogBreed(String breed) {

        boolean deleted = false;
        Iterable<Dog> allDogs = dogRepository.findAll();

        for(Dog d : allDogs) {
            if(d.getBreed().equals(breed)) {
                dogRepository.delete(d);
                deleted = true;
            }
        }

        if(!deleted) {
            throw new BreedNotFoundException("Breed Not Found", breed);
        }

        return deleted;
    }

    public Dog updateDogName(String name, Long id) {

        Optional<Dog> optionalDog = dogRepository.findById(id);

        if(optionalDog.isPresent()) {
            Dog dog = optionalDog.get();
            dog.setName(name);
            dogRepository.save(dog);
            return dog;
        }

        throw new DogNotFoundException("Id Not Found", id);
    }
}