class SetGetTest {

	public static void main (String args[]) {

		Dos obj1 = new Dos();

		obj1.var1Set(7);

		System.out.println("El valor de var1 es " + obj1.var1Get());

	}

}

class Dos {

	private int var1;

	private int var2;

	public void var1Set(int var1) {

		this.var1 = var1;

	}

	public int var1Get() {

		return var1;
	
	}

}