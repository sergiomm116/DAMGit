import java.util.ArrayList;
import java.util.List;

public class P1019 {

	public static void main (String args[]) {

		System.out.println(-7>>>1);		//Why does this return a positive big-a number?


		final double PI = 3.141592;		//This is how you declare a constant. Writing the constant in capital letters is part of the convention
	

		//Create list of reminders

		int tobin = 669;

		int div, rem;

		List<Integer> list_rem = new ArrayList<Integer>();

		do{

			list_rem.add(669%2);

			tobin /= 2;

		} while (tobin>=2);

		

		//Print list of reminders to form a binary
		
		int size = list_rem.size();

		for (int = 0; i<size; i++) {

			System.out.print(list_rem.remove(i) + " ");

		}

	}

}