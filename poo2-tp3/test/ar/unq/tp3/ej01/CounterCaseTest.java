package ar.unq.tp3.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterCaseTest {
	
	private Counter counter;

	@BeforeEach
	public void setUp() {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(2);
		counter.addNumber(3);
		counter.addNumber(4);
		counter.addNumber(5);
	}
	
	@Test
	void TestContarPares() {
		assertEquals(counter.cantidadDePares(), 2);
	}
	
	@Test
	void TestContarImpares() {
		assertEquals(counter.cantidadDeImpares(), 3);
	}
	
	@Test
	void TestMultiplosDeCiertoNumero() {
		assertEquals(counter.cantidadDeMultiplosDe(2), 2);
	}

}
