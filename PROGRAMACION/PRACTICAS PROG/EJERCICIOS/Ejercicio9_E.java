import java.util.Scanner;
public class Ejercicio9_E {
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int binary[] = new int[num];
		int index = 0;
		while(num > 0){
			binary[index++] = num%2;
			num = num/2;
		}
		for(int i = index-1;i >= 0;i--){
		System.out.print(binary[i]);
     }
 }
 }

