package com.demo.bootstrap.repository;

import java.util.List;

import com.demo.bootstrap.entity.Dog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {

    @Query("select breed from Dog where id=:id")
    String findBreedById(Long id);

    @Query("select id, breed from Dog")
    List<String> findAllBreed();

    @Query("select id, name from Dog")
    List<String> findAllName();

    @Query("select name from Dog where name=:name")
    String findDogByName(String name);
}