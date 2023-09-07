package cl.coopeuch.tarea.test;

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
public class TestActualizarTarea {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testActualizarTarea() throws Exception {
        int tareaId = 1;

        String tareaActualizadaJson = "{ \"descripcion\": \"Nueva descripción\" }";

        mockMvc.perform(MockMvcRequestBuilders.put("/update/" + tareaId)
                .contentType(MediaType.APPLICATION_JSON)
                .content(tareaActualizadaJson))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Updated..."));
    }
}
