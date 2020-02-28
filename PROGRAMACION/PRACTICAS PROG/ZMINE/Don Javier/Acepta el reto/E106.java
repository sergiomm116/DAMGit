public class E106 {
	
	static public void EAN8 (int cod){
		System.out.print(cod+" ");
		String codigo = String.valueOf(cod);
		int length = codigo.length();
		
		if(codigo.length()==8){
		
			int uno = cod/10000000;
			int dos = cod/1000000-uno*10;
			int tres = cod/100000-uno*100-dos*10;
			int cuatro = cod/10000-uno*1000-dos*100-tres*10;
			int cinco = cod/1000-uno*10000-dos*1000-tres*100-cuatro*10;
			int seis = cod/100-uno*100000-dos*10000-tres*1000-cuatro*100-cinco*10;
			int siete = cod/10-uno*1000000-dos*100000-tres*10000-cuatro*1000-cinco*100-seis*10;
			int ocho = cod-uno*10000000-dos*1000000-tres*100000-cuatro*10000-cinco*1000-seis*100-siete*10;
			
			
			
			int dig = siete*3+seis+cinco*3+cuatro+tres*3+dos+uno*3;
			
			
			//~ System.out.println(uno+" "+dos+" "+tres+" "+cuatro+" "+cinco+" "+seis+" "+siete+" "+ocho+" "+dig);
			
			
			
			
			if ((((dig+ocho)%10==0) || ((dig-ocho)%10==0)) && dig!=0){
				
				System.out.println(" SI");
			}else{
				System.out.println(" NO");
			}
		}else{
			System.out.println(" NO");
		}
	}
	public static void main (String[] args) {
		
		
		EAN8(65839522);
		EAN8(65839521);
		EAN8(0);
		
		
	}
}

