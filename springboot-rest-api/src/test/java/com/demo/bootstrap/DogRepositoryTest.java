package com.demo.bootstrap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import javax.activation.DataSource;
import javax.persistence.EntityManager;

import com.demo.bootstrap.entity.Dog;
import com.demo.bootstrap.repository.DogRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.hamcrest.Matchers.notNullValue;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DogRepositoryTest {

    @Autowired private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
    @Autowired private EntityManager entityManager;
    @Autowired private TestEntityManager testEntityManager;
    @Autowired private DogRepository dogRepository;

    @Test
    public void injectedComponentsAreNotNull() {

        assertThat(dataSource, notNullValue());
        assertThat(jdbcTemplate, notNullValue());
        assertThat(entityManager, notNullValue());
        assertThat(testEntityManager, notNullValue());
        assertThat(dogRepository, notNullValue());

    }

    @Test
    public void testFindDogs() {
        Dog dog = new Dog();
        dog.setBreed("Breed");
        dog.setName("Name");
        dog.setOrigin("Origin");

        entityManager.persist(dog);

        String actual = dogRepository.findDogByName("Name");
        assertThat(actual, notNullValue());
        assertEquals(dog.getName(), actual);
    }
}