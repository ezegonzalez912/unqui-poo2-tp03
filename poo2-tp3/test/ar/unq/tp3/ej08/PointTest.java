package ar.unq.tp3.ej08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	
	private Point point;
	
	@BeforeEach
	private void SetUp() {
		point = new Point(1,2);
	}

	@Test
	void testCrearPuntoConValores() {
		assertEquals(1, point.getX());
		assertEquals(2, point.getY());
	}
	
	@Test
	void testCrearPuntoSinValores() {
		
		point = new Point();
		
		assertEquals(0, point.getX());
		assertEquals(0, point.getY());
	}
	
	@Test
	void testMoverUnPunto() {
		
		Point newPoint = new Point(2,2);
		
		point.movePoint(newPoint);
		
		assertEquals(2, point.getX());
		assertEquals(2, point.getY());
	}
	
	@Test
	void testSumarUnPunto() {
		
		Point point1 = new Point(2,2);
		Point point2 = new Point(2,2);
		
		Point newPoint = point1.additionPoint(point2);
		
		assertEquals(4, newPoint.getX());
		assertEquals(4, newPoint.getY());
	}

}
