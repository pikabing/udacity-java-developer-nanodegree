package com.demo.bootstrap.service;

import java.util.List;

import com.demo.bootstrap.entity.Dog;

public interface DogService {

    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}