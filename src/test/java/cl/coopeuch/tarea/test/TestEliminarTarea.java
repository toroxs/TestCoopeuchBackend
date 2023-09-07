package cl.coopeuch.tarea.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import cl.coopeuch.tarea.Apirest.ApirestCoopeuchApplication;

@SpringBootTest(classes = ApirestCoopeuchApplication.class)
@AutoConfigureMockMvc
public class TestEliminarTarea {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEliminarTarea() throws Exception {
        int tareaId = 1;
        mockMvc.perform(MockMvcRequestBuilders.delete("/delete/" + tareaId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Delete Tarea: " + tareaId));
    }
}
