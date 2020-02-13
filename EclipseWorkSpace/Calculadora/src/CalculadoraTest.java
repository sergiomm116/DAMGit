import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	void testSuma() {
		Calculadora calcu = new Calculadora (20, 10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	void testResta() {
		Calculadora calcu = new Calculadora (20, 10);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}
	
	@Test
	void testResta2() {
		Calculadora cal1 = new Calculadora (5, 7);
		Calculadora cal2 = new Calculadora (7, 3);
		
		assertTrue(cal1.resta2(), "Se usaria una resta ordenada");
		assertTrue(cal2.resta2(), "Se usaria una resta normal");
	}

	@Test
	void testDivide2() {
		Calculadora cal1 = new Calculadora (5, 0);
		Calculadora cal2 = new Calculadora (7, 3);
		
		assertNull(cal1.divide2(), "");
		assertNotNull(cal2.divide2(), "");
		assertEquals(cal2.divide2(), "");
	}

	@Test
	void testMultiplica() {
		Calculadora calcu = new Calculadora (20, 10);
		int resultado = calcu.multiplica();
		assertEquals(200, resultado);
	}

	@Test
	void testDivide() {
		Calculadora calcu = new Calculadora (20, 10);
		int resultado = calcu.divide();
		assertEquals(2, resultado);
	}

}
