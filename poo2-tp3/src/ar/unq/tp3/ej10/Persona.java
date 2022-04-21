package ar.unq.tp3.ej10;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private int edad;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		LocalDate hoy = LocalDate.now();
		this.edad = hoy.getYear() - fechaNacimiento.getYear();
	}
	
	public int getEdad() {
		return edad;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
}
