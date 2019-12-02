public class StringhashCode {
	
	public static void main (String[] args) {
		String texto1 = "abc";
		System.out.println(texto1.hashCode());
	
		System.out.println((97*31*31)+(98*31)+(99*1));
		
		//~ a[0]*31^(3 - 1) + b[1]*31^(3 - 2) c[3]*31^(3 - 3)
	}
}

