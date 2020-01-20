class Password {
	
	private int longitud;
	private String pass;
	
	public void Password (){
		this.longitud=8;
	}
	
	public void Password (int longitud){
		this.longitud=longitud;
	}
	
	public boolean esFuerte(){
		return contrasenya.matches(".*[A-Z][a-z]\d{3,}.*");
	}
	
	public void generarPassword(){
		
	}
	
}

