package com.demo.bootstrap.service;

import java.util.List;

import com.demo.bootstrap.entity.Dog;
import com.demo.bootstrap.repository.DogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface DogService {

    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}