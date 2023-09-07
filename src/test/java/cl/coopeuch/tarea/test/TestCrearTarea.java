package cl.coopeuch.tarea.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import cl.coopeuch.tarea.Apirest.ApirestCoopeuchApplication;

@SpringBootTest(classes = ApirestCoopeuchApplication.class)
@AutoConfigureMockMvc
public class TestCrearTarea {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCrearTarea() throws Exception {
        String nuevaTareaJson = "{ \"descripcion\": \"Nueva tarea\", \"vigente\": true }";

        mockMvc.perform(MockMvcRequestBuilders.post("/save")
                .contentType(MediaType.APPLICATION_JSON)
                .content(nuevaTareaJson))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Saved..."));

    }
}

