package ar.unq.tp3.ej02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterCaseTest {

	private Counter counter;
	private ArrayList<Integer> numeros = new ArrayList<>();

	@BeforeEach
	public void setUp() {
		counter = new Counter();
	}
	
	@Test
	void TestContarDigitosPares() {
		assertEquals(counter.digitosParesDe(111), 0);
		assertEquals(counter.digitosParesDe(211), 1);
		assertEquals(counter.digitosParesDe(221), 2);
		assertEquals(counter.digitosParesDe(222), 3);
	}
	
	@Test
	void TestMayorNumeroConDigitosPares1() {
		assertEquals(counter.mayorNumeroConDigitosParesDe(numeros), 0);
	}
	
	@Test
	void TestMayorNumeroConDigitosPares2() {
		numeros.add(111);
		assertEquals(counter.mayorNumeroConDigitosParesDe(numeros), 111);
		
		numeros.add(221);
		assertEquals(counter.mayorNumeroConDigitosParesDe(numeros), 221);
		
		numeros.add(111);
		assertEquals(counter.mayorNumeroConDigitosParesDe(numeros), 221);
	}

}
