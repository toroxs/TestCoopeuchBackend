package cl.coopeuch.tarea.Apirest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.coopeuch.tarea.Apirest.Models.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Integer>{

}
