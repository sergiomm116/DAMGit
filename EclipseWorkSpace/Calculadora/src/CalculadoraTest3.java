import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class CalculadoraTest3 {
	private int n1, n2, res;
	
	public CalculadoraTest3 (int n1, int n2, int res) {
		this.n1 = n1;
		this.n2 = n2;
		this.res = res;
	}
	
	@Parameters
	public static Collection<Object[]> numeros () {
		return Arrays.asList (new Object[][] {
			{20, 10, 2}, {30, -2, 28}, {5, 2, 3}
		});
	}
	
	@Test
	public void testDivide() {
		Calculadora calcu = new Calculadora (n1, n2);
		int resul = calcu.divide();
		assertEquals(res, resul);
	}
	
	@Test
	public void testSuma() {
		Calculadora calcu = new Calculadora (n1, n2);
		int resul = calcu.suma();
		assertEquals(res, resul);
	}
	
	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora (n1, n2);
		int resul = calcu.resta();
		assertEquals(res, resul);
	}
	

}
