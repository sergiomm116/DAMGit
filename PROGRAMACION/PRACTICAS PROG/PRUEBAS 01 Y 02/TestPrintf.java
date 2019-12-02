public class TestPrintf {
	
	public static void main (String[] args) {
		float dblTotal=123567.1234567f;
		int v1=987654321;
		int v2=2345;
		int v3=13245;
		
		
		System.out.printf("El total es: $%,.2f%n", dblTotal);
		
		System.out.printf("Total: %2$-10.2f | | %1$10d\n ", v1,dblTotal,v1,v2,v3);
		
		int intValue=12;
		System.out.printf("% 4d", intValue);
		
		String stringVal="Texto para representar en pantalla";
		System.out.printf("%20.15S\n", stringVal);
		
		String s = "Hello World";
		System.out.printf("El string %s tiene un hash code %h%n", s, s);
	}
}

