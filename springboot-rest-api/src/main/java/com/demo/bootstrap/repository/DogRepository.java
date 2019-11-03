package com.demo.bootstrap.repository;

import java.util.List;

import com.demo.bootstrap.entity.Dog;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("select breed from Dog where id=:id")
    String findBreedById(Long id);

    @Query("select id, breed from Dog")
    List<String> findAllBreed();

    @Query("select id, name from Dog")
    List<String> findAllName();
}