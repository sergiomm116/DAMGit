import java.util.Scanner;

public class Ejercicio21 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		n--;
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] aux = new int[n];
		int h = 0;
		int j;
	
		
		for (int i = 0; i < arr1.length;i++){
			arr1[i]=(int)(Math.random()*25+97);
			arr2[i]=(int)(Math.random()*25+97);
		}
		
		System.out.print("Array 1: ");
		
		for (int i:arr1){
			System.out.print((char)i+", ");
			
			for (j = 0; j < n;j++){
				if (arr2[j] == arr1[i]) {
					aux[h] = arr2[j];
					h++;
				}
			}
			
		}
		
		System.out.println("\b\b ");
		
		System.out.print("Array 2: ");
		
		
		for (int i:arr2){
			System.out.print(i+", ");
			
			
			
		}
		
		System.out.println("\b\b ");
		
		for (int i:aux){
			System.out.print(i+", ");
		}
		System.out.println("\b\b ");
		
		
		
		
	}
}

