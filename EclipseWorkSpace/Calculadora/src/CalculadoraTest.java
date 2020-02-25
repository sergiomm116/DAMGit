import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calcu;
	private int resultado;
	
	@Before
	public void creaCalculadora() {
		calcu = new Calculadora (20, 10);
	}
	
	@After
	public void borraCalculadora() {
		calcu = null;
	}

	@Test
	public void testSuma() {
		resultado = calcu.suma();
		assertEquals("vEsperado y vReal no son iguales",30, resultado);
	}

	@Test
	public void testResta() {
		int resultado = calcu.resta();
		assertEquals("vEsperado y vReal no son iguales",10, resultado);
	}

	@Test
	public void testMultiplica() {
		resultado = calcu.multiplica();
		assertEquals("vEsperado y vReal no son iguales",200, resultado);
	}

	@Test
	public void testDivide() {
		resultado = calcu.divide();
		assertEquals("vEsperado y vReal no son iguales",2, resultado);
	}
	
	
	//3.1
	
	/*@Test
	public void testResta() {
		int resultado = calcu.resta();
		assertEquals("vEsperado y vReal no son iguales",10, resultado);
	}
	
	@Test
	public void testResta2() {
		boolean resultado = calcu.resta2();
		assertTrue("vEsperado y vReal no son iguales",calcu.resta2());
	}
	
	@Test
	public void testDivide2() {
		Integer resultado = calcu.divide2();
		assertNull("vEsperado y vReal no son iguales",calcu.divide2());
	}*/
	

}
