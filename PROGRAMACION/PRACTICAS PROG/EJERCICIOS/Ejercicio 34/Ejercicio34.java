class Producto {
	protected String fechacad;
	protected String numerolote;
   
	public Producto (String fechacad, String numerolote){
		this.fechacad = fechacad;
		this.numerolote = numerolote;
	}	
   
	public void fechaSet(String fecha){
	   this.fechacad = fecha;
	}
	
	public String fechacadGet(){
      return fechacad;
	}
   
	public void numeroSet(String numero){
	   this.numerolote = numero;
	}
   
	public String numeroloteGet(){
      return numerolote;
	}
   
   
   
}
class Fresco extends Producto {
	
	protected String fechaenv;
	protected String pais;
	
	public String fechaenvGet(){
	  return fechaenv;
	}

	public String paisGet(){
	  return pais;
	}
	
	public Fresco (String fechacad, String numerolote, String fechaenv, String pais){
		super(fechacad, numerolote);
		this.fechaenv = fechaenv;
		this.pais = pais;
	}

}
class Refrigerado extends Producto {
	
	protected String codigo;
	
	public String codigoGet(){
	  return codigo;
	}
	
	public Refrigerado (String fechacad, String numerolote, String codigo){
		super(fechacad, numerolote);
		this.codigo = codigo;
	}
	
}
class Congelado extends Producto {
	
	protected String temp;
	
	public String tempGet(){
	  return temp;
	}
	public Congelado (String fechacad, String numerolote, String temp){
		super(fechacad, numerolote);
		this.temp = temp;
	}
	
}
class Ejercicio34 {
	public static void main(String[] args) {
		
		
		Fresco tomates = new Fresco("22/02/2020","12314","14/02/2020","Espa\u00f1a");
			System.out.println("----- Producto fresco -----");
			System.out.println();
			System.out.println("Fecha de caducidad: "+tomates.fechacadGet());
			System.out.println("N\u00famero de lote: "+tomates.numeroloteGet());
			System.out.println("Fecha de envasado: "+tomates.fechaenvGet());
			System.out.println("Pais de origen: "+tomates.paisGet());
			System.out.println();
			System.out.println();
		
		
		Refrigerado leche = new Refrigerado("15/04/2020","36575","456234523");
			System.out.println("----- Producto refrigerado -----");
			System.out.println();
			System.out.println("Fecha de caducidad: "+leche.fechacadGet());
			System.out.println("Fecha de caducidad: "+leche.numeroloteGet());
			System.out.println("C\u00f3digo: "+leche.codigoGet());
			System.out.println();
			System.out.println();

		Congelado merluza = new Congelado("28/09/2020","56335","-5");
			System.out.println("----- Producto congelado -----");
			System.out.println();
			System.out.println("Fecha de caducidad: "+merluza.fechacadGet());
			System.out.println("N\u00famero de lote: "+merluza.numeroloteGet());
			System.out.println("Temperatura: "+merluza.tempGet());
			System.out.println();
			System.out.println();
	  
	}
}
