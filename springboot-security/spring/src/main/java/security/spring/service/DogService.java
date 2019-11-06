package security.spring.service;

import java.util.List;

import security.spring.entity.Dog;

public interface DogService {

    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}