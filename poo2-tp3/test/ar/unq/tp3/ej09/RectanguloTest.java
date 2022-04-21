package ar.unq.tp3.ej09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.tp3.ej08.Point;

class RectanguloTest {
	
	private Rectangulo rectangulo;
	
	private Point point;
	private int height;
	private int width;
	
	@BeforeEach
	private void setUp() {

		point = new Point(10,20);
		height = 10;
		width = 20;
		
	}
	
	@Test
	void testCrearDeFormaApropiada() {
		
		height = 20;
		
		try {
			rectangulo = new Rectangulo(point, height, width);
			fail("No deberia crear el rectangulo");
		} catch (Exception error) {
			assertEquals(error.getMessage(), "Esta intentando crear un cuadrado");
		}
		
	}
	
	@Test
	void testObtenerArea() throws Exception {
		
		rectangulo = new Rectangulo(point, height, width);
		
		assertEquals(200, rectangulo.getArea());
		
	}
	
	@Test
	void testObtenerPosicionamiento() throws Exception {
		
		rectangulo = new Rectangulo(point, height, width);
		
		assertEquals(rectangulo.getPosicionamiento(), "Horizontal");
		
	}

}
