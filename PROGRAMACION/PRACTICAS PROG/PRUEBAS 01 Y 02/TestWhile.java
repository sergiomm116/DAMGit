public class TestWhile {
	
	public static void main (String[] args) {
		boolean fin=true;
		while (fin) {
			int a = (int) (Math.random()*50+1);
			System.out.println(a);
			if (a%5==0) {
				fin=false;
			}
		}
	}
}

