package cl.coopeuch.tarea.Apirest.Models;

import java.sql.Date;
import java.time.LocalDate;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;

@Entity
public class Tarea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
    private String descripcion;
	
	@Column(nullable = false)
    private LocalDateTime fechaCreacion;
    
	@Column
    private boolean vigente;
	
//Other Methods	
	@PrePersist
    protected void onCreate() {
        fechaCreacion = LocalDateTime.now();
    }
    
    
//Getters and Setters    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public boolean isVigente() {
		return vigente;
	}
	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}
    
}
