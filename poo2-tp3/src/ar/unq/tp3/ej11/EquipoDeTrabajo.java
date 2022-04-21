package ar.unq.tp3.ej11;

import java.util.ArrayList;

import ar.unq.tp3.ej10.Persona;

public class EquipoDeTrabajo {
	
	private String  nombreEquipo;
	private ArrayList<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
	
		this.nombreEquipo = nombre;
		this.integrantes = integrantes;
	
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public int promedioDeEdad() {
		
		int sumaEdad = 0;
		for (Persona persona : integrantes) {
			sumaEdad = sumaEdad + persona.getEdad();
		}
		
		return sumaEdad / integrantes.size();
	}
	
}
