import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String args[]) {
		
		// Initialize
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce dia: ");
		
		int day = keyboard.nextInt();
		
		System.out.print("Introduce mes: ");
		
		int month = keyboard.nextInt();
		
		System.out.print("Introduce año: ");
		
		int year = keyboard.nextInt();
		
		int lucky = 0;	
		
		
		
		// Treat each number to reduce it to the sum
		
		while (day >= 10) {
			
			day = (day/10) + (day - (day/10)*10);
			
		}	

		
		
		if (month >= 10) {
			
			month = (month/10) + (month - (month/10)*10);
			
		}
		
		while (year >= 10) {
		
			year = year/1000 + ((year/100) - (year/1000)*10) + (year/10 - (year/100)*10) + year -(year/10)*10;
			
		}
		
		
		
		// Sum all of them and treat the lucky until we have the result
		
		lucky = day + month + year;
		
		while (lucky >= 10) {
			
			lucky = (lucky/10) + (lucky - (lucky/10)*10);
			
		}
		
		System.out.println("Tu Lucky Number es: " + lucky);
		
	}

}
