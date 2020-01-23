public class maspruebasmatches {

	public static void main (String args[]) {

		String string1 = "342";

		String string2 = "46&2";

		String string3 = "Y24No32Yes";



		System.out.println(string1.matches("\\d{4}"));

		System.out.println(string2.matches("\\d{2}.*"));

		System.out.println(string3.matches("\\d{2}.*\\d{2}.*"));
	
	}

}