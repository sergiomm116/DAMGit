import java.util.Scanner;

public class Ejercicio29 {

	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce numero de botes: ");

		int test = keyboard.nextInt();

		int base = calcbase(test);

		int rest = (calcrest(base,test));

		int top = (calctop(base,test));

		print(base,top,rest);

	}

	static int calcbase(int a) {

		int base = 0;

		int total = 0;

		while (total<a) {

			total += ++base;

		}

		return base;

	}

	static int calcrest(int base, int test) {

		while (test>base) {

			test -= base;

			base--;

		}

		if (test==base) test = 0;

		return test;

	}

	static int calctop(int base, int test) {

		while (test>base) {

			test -= base;

			base--;

		}

		if (base!=test) base++;

		return base;

	}

	static void print(int base, int top, int rest) {

		while (top < base) {

			int empty = ((base*6)-(top*6))/2;

			for (int i=0; i<5; i++) {

				for (int j=0; j<empty; j++) System.out.print(" ");
	
				for (int j=0; j<top; j++) System.out.print("***** ");

				for (int j=0; j<empty; j++) System.out.print(" ");

				System.out.println();

			}

			top++;

		}

		for (int i=0; i<5; i++) {

			for (int j=0; j<base; j++) System.out.print("***** ");

			System.out.print(" ");

			for (int j=0; j<rest; j++) System.out.print("***** ");

			System.out.println();

		}

	}

}