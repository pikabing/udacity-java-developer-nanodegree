package com.demo.graphql.repository;


import com.demo.graphql.entity.Dog;

import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
