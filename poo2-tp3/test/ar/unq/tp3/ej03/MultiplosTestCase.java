package ar.unq.tp3.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplosTestCase {

	private Multiplos multiplos;
	
	@BeforeEach
	public void setUp() {
		multiplos = new Multiplos();
	}
	
	@Test
	void TestMayorMultiplo() {
		assertEquals(multiplos.mayorMultiplo(3, 9), 999);
		assertEquals(multiplos.mayorMultiplo(33, 67), -1);
	}

}
