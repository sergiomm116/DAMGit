import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {


	@Test
	public void testSuma() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora(10, 20);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}
	
	@Test
	public void testResta2() {
		Calculadora calcu = new Calculadora(10, 20);
		int resultado = calcu.resta();
		assertNull(10, resultado);
	}
	
	
	

	@Test
	public void testMultiplica() {
		Calculadora calcu = new Calculadora(20, 50);
		int resultado = calcu.multiplica();
		assertEquals("Fallo en la multiplicación :",200, resultado);	
	}

	@Test
	public void testDivide() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.divide();
		assertEquals(2, resultado);	
	}
	
	@Test
	public void testException() {
		try {
			Calculadora calcu = new Calculadora (20, 0);
			int resultado = calcu.divide();
			fail("FALLO, Deberia haber lanzado la excepción");
			} catch (ArithmeticException e) {
				//PRUEBA satisfactoria
		}
	}

}
