public class RandomToPI{
	
	public static void main (String[] args) {
		int j = 0;
		int z = 0;
		for(int i = 0; i <= 1000; i++){
			double x = Math.random();
			double y = Math.random();
			
			if(x+y<=1){
				j++;
			}else{
				z++;
			}
		}
		//~ double x = Math.random();
		//~ double y = Math.random();
		//~ System.out.println(x+" "+y);
		//~ System.out.println(x+y);
		System.out.print(j+" "+z);
	}
}

