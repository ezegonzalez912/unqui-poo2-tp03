package ar.unq.tp3.ej09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.tp3.ej08.Point;

class CuadradoTest {
	
	private Cuadrado cuadrado;
	
	private Point point;
	private int height;
	private int width;
	
	@BeforeEach
	private void setUp() {

		point = new Point(10,20);
		height = 10;
		width = 10;
		
	}
	
	@Test
	void testCrearDeFormaApropiada() {
		
		height = 20;
		
		try {
			cuadrado = new Cuadrado(point, height, width);
			fail("No deberia crear el cuadrado");
		} catch (Exception error) {
			assertEquals(error.getMessage(), "Esta intentando crear un rectangulo");
		}
		
	}
	
	@Test
	void testObtenerArea() throws Exception {
		
		cuadrado = new Cuadrado(point, height, width);
		
		assertEquals(100, cuadrado.getArea());
		
	}

}
