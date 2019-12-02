public class Ejercicio1 {
	
	public static void main (String[] args) {
		char pass[];
		pass = new char[6];
		char vocales[];
		int random=0;
		vocales = new char[] {97,101,195,111,117};
		for(int i=0;i<=5;i++){
			double n = (Math.random()*(122-97))+97;
			char letra = (char)n;
			pass[i]=letra;
			
			if (i>=1)
				if (pass[i]==pass[i-1])
				n = (Math.random()*(122-97))+97;
				letra = (char)n;
				pass[i]=letra;
		System.out.print(letra);
		}
	}
}

