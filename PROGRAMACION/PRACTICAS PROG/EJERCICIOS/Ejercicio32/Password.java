class Password1 {
	
	private int longitud;
	private String contrasenya="";
	
	Password1 (){
		this.longitud=8;
		generarPassword();
	}
	
	Password1 (int longitud){
		this.longitud=longitud;
		generarPassword();
	}
	
	public String contrasenyaGet(){
		return contrasenya;
	}
	
	public boolean esFuerte(){
		if(contrasenya.matches(".*[A-Z].*")) {
			if(contrasenya.matches(".*[a-z].*")) {
				if(contrasenya.matches(".*\\d{1,}.*\\d{1,}.*\\d{1,}")) {
					return true;
				}
				else return false;
			}
			else return false;
		}
		else return false;
	}
	
	generarPassword (){
		
	}
	
}

