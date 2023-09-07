package cl.coopeuch.tarea.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import cl.coopeuch.tarea.Apirest.ApirestCoopeuchApplication;

@SpringBootTest(classes = ApirestCoopeuchApplication.class)
@AutoConfigureMockMvc
public class TestListarTareas {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testListarTareas() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/tarea"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }
}