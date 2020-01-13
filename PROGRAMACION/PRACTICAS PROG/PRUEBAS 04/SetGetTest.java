class Dos {
	
	private int var1;							//Declarar variable private
	
	public void var1Set(int var1){				//Metodo set
		this.var1 = var1;
	}
	
	public int var1Get(){						//Metodo get
		return var1;
	}
}

class SetGetTest{

	public static void main(String args[]){
		Dos obj1=new Dos();
		obj1.var1Set(7);
		System.out.println(obj1.var1Get());
	}

}

