package ar.unq.tp3.ej06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorCaseTest {

	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() {
		multioperador = new Multioperador();
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
	}
	
	@Test
	void TestSumarEnteros() {
		assertEquals(5, multioperador.sumarEnteros());
	}
	
	@Test
	void TestRestarEnteros() {
		assertEquals(-5, multioperador.restarNumeros());
	}

	@Test
	void TestMultiplicarEnteros1() {
		assertEquals(1, multioperador.multiplicarNumeros());
	}
	
	@Test
	void TestMultiplicarEnteros2() {
		multioperador.addNumber(2);
		multioperador.addNumber(2);
		multioperador.addNumber(2);
		assertEquals(8, multioperador.multiplicarNumeros());
	}
}
