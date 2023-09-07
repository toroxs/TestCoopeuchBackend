package cl.coopeuch.tarea.Apirest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.coopeuch.tarea.Apirest.Models.Tarea;
import cl.coopeuch.tarea.Apirest.Repository.TareaRepository;

@RestController
public class TareaController {
	
	@Autowired
	private TareaRepository tareaRepository;
	
	@GetMapping(value = "/")
	public String getPage() {
		return "Servicio OK";
	}
	
	@GetMapping(value =  "/tarea")
	public List<Tarea> getTareas(){
		return tareaRepository.findAll();
	}
	
	@PostMapping(value = "/save")
	public String saveTarea(@RequestBody Tarea tarea) {
		tareaRepository.save(tarea);
		return "Saved...";
	}
	
	@PutMapping(value = "/update/{id}")
	public String UpdateTarea(@PathVariable int id, @RequestBody Tarea tarea) {
		Tarea updatedTarea = tareaRepository.findById(id).get();
		updatedTarea.setDescripcion(tarea.getDescripcion());
		tareaRepository.save(updatedTarea);
		return "Updated...";
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteTarea(@PathVariable int id) {
		Tarea deleteTarea = tareaRepository.findById(id).get();
		tareaRepository.delete(deleteTarea);
		return "Delete Tarea: " + id;
	}
}
