public class Taxi {
	public static void main (String[] args) {
		
		String matricula = "";
		boolean disponible = false;
		int ingresos = 0;
		
		
		// matricula
		for (int i = 0; i < 6; i++) {
			char letra = (char) ((Math.random()*25)+65);
			matricula = matricula + letra;
		}
		
		matricula = matricula + (int) (Math.random()*9+1);;
		System.out.println(matricula);
			
		
		
		// disponible
		
		int aux = (int) (Math.random()*9+1);
		
		if (aux >= 5){
			disponible = true;
		}
		System.out.println(disponible);
	
	}
}
