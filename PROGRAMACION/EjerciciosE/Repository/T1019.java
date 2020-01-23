public class T1019 {

	public static void main (String args[]) {

		System.out.print("Hola");		//This method does not jump to the next line after writing

		System.out.print("\b");

		System.out.println("Adios");

		

		//OPERADORES ARITMÉTICOS

		int value;

		value = 8 % 3;				//Value is autocasted

		System.out.println(value);

		

		//OPERADORES RELACIONALES

		int v1 = (3+2) * 4;

		System.out.println(v1);



		//OPERACIONES LÓGICAS

		System.out.println(7|4);		//The doublle & or | does not work on numerical values

	}

}