public class whiling {

	public static void main (String args[]) {

		int number=-1;

		while (number%5!=0) {

			number = (((int) (Math.random()*50)) + 1);

			System.out.println(number);

		}

	}

}