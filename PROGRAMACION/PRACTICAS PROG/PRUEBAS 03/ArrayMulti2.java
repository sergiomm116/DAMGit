import java.util.Arrays;
public class ArrayMulti2 {
	
	public static void main (String[] args) {
														
		int array1[]=new int [5];					//Arrays.fill
		Arrays.fill(array1,7);
		for(int i:array1){
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int array2[]=new int [50];					//Arrays.sort y Arrays.binarySearch
		for (int i=0;i<=49;i++){
			array2[i]=(int)(Math.random()*49+1);
			}
			
		Arrays.sort(array2);
		
		
		for(int x : array2){
		System.out.print(x+" ");
		}
		
		System.out.println("\n"+Arrays.binarySearch(array2, 8));
		
			
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int array3[]=new int [0];					//Arrays.copyOf, hashCode y gc
		System.out.println(array3.hashCode());
		System.out.println(array3);
		array3=Arrays.copyOf(array1,10);
		for(int x : array3){
		System.out.print(x+" ");
		}
		System.out.println("\n"+array3.hashCode());
		System.out.println(array3);
		
		System.gc();
		System.out.println(array3.hashCode());
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int array4[]=new int[]{1,6,8,4,2};
		int array5[]=new int[]{1,6,8,4,2};
		
		if(array4==array5){							//Arrays.equals (Un array no se puede comparar con ==, Arrays.equals compara lo que contiene)
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		System.out.println("\n"+Arrays.equals(array4, array5));
		
		System.out.println(Arrays.toString(array4));	//Arrays.toString
		
		
		int array6[][][]=new int [5][6][7];				//.length (Constructor de lenguaje)
		System.out.println(array6.length);	
		System.out.println(array6[1].length);
			
		
		
	}
}

