class Monedero{

	private String nombrem;
	private int saldo;
	
	
	Monedero (String nombrem, int saldo){
		this.nombrem=nombrem;
		this.saldo=saldo;
	}
	
	String nombreGet(){
		return nombrem;
	}
	
	int saldoGet(){
		return saldo;
	}
	
	void reintegro (int dinero){
		if (saldo>=dinero)
			saldo-=dinero;
		else 
			System.out.println("Dispone de: "+saldo);	
	}
		
	void ingreso (int dinero){
		saldo+=dinero;
	}
}

