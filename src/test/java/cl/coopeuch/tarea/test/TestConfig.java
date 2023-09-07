package cl.coopeuch.tarea.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cl.coopeuch.tarea.Apirest.Controller.TareaController;

@Configuration
public class TestConfig {

    @Bean
    public TareaController tareaController() {
        return new TareaController();
    }

}
