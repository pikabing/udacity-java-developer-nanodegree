package com.demo.bootstrap;

import com.demo.bootstrap.service.DogService;
import com.demo.bootstrap.web.DogController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DogController.class)
public class DogUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    DogService dogService;

    @Test
    public void getAllDogs() throws Exception {
        mockMvc.perform(get("/dogs/"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(org.springframework.http.MediaType.APPLICATION_JSON_UTF8))
        .andExpect(content().json("[]"));
    }

    @Test
    public void getDog() throws Exception {
        mockMvc.perform(get("dogs/1/breed"))
        .andExpect(status().isOk());

        verify(dogService, times(1)).retrieveDogBreedById((long)1);
    }
    
}