package ar.unq.tp3.ej11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.tp3.ej10.Persona;

class EquipoTrabajoTest {
	
	private EquipoDeTrabajo equipoDeTrabajo;
	
	@BeforeEach
	private void setUp() {
		
		ArrayList<Persona> integrantes = new ArrayList<Persona>();
		
		Persona juan = new Persona("Juan", LocalDate.of(2001, 12, 1));
		Persona marcos = new Persona("Marcos", LocalDate.of(2000, 12, 1));
		
		integrantes.add(juan);
		integrantes.add(marcos);
		
		equipoDeTrabajo = new EquipoDeTrabajo("Cracks", integrantes);
		
	}
	
	@Test
	void testObtenerNombreDeEquipo() {
		assertEquals(equipoDeTrabajo.getNombreEquipo(), "Cracks");
	}
	
	@Test
	void testObtenerPromedioDeEdad() {
		assertEquals(equipoDeTrabajo.promedioDeEdad(), 21);
	}
	


}

