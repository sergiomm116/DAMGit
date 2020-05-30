import java.util.Scanner;
public class Ejercicio13 {
	
	public static void main (String[] args) {
		
			Scanner input=new Scanner(System.in);
			System.out.print("INTRODUCE UN NUMERO DEL 1 AL 100 Y TE DIRE COMO SE ESCRIBE: ");
			int n=input.nextInt();
			
			if(n>0 && n<101){
				System.out.print("EL NUMERO "+n+" ES EL ");
					if(n>=16 && n<=19){
						System.out.print("DIECI");
						n=n-10;
					}
					if(n>=21 && n<=29){
						System.out.print("VEINTI");
						n=n-20;
					}
					if(n==30){
						System.out.print("TREINTA");
					}
					if(n>=31 && n<=39){
						System.out.print("TREINTA Y ");
						n=n-30;
					}
					if(n==40){
						System.out.print("CUARENTA");
					}
					if(n>=41 && n<=49){
						System.out.print("CUARENTA Y ");
						n=n-40;
					}
					if(n==50){
						System.out.print("CIENCUENTA");
					}
					if(n>=51 && n<=59){
						System.out.print("CINCUENTA Y ");
						n=n-50;
					}
					if(n==60){
						System.out.print("SESENTA");
					}
					if(n>=61 && n<=69){
						System.out.print("SESENTA Y ");
						n=n-60;
					}
					if(n==70){
						System.out.print("SETENTA");
					}
					if(n>=71 && n<=79){
						System.out.print("SETENTA Y ");
						n=n-70;
					}
					if(n==80){
						System.out.print("OCHENTA");
					}
					if(n>=81 && n<=89){
						System.out.print("OCHENTA Y ");
						n=n-80;
					}
					if(n==90){
						System.out.print("NOVENTA");
					}
					if(n>=91 && n<=99){
						System.out.print("NOVENTA Y ");
						n=n-90;
					}
					if(n==100){
						System.out.print("CIEN");
					}
					if(n<=20){
						switch (n) {
							case 0:
								System.out.print("CERO");
								break;
							case 1:
								System.out.print("UNO");
								break;
							case 2:
								System.out.print("DOS");
								break;
							case 3:
								System.out.print("TRES");
								break;
							case 4:
								System.out.print("CUATRO");
								break;
							case 5:
								System.out.print("CINCO");
								break;
							case 6:
								System.out.print("SEIS");
								break;
							case 7:
								System.out.print("SIETE");
								break;
							case 8:
								System.out.print("OCHO");
								break;
							case 9:
								System.out.print("NUEVE");
								break;
							case 10:
								System.out.print("DIEZ");
								break;
							case 11:
								System.out.print("ONCE");
								break;
							case 12:
								System.out.print("DOCE");
								break;
							case 13:
								System.out.print("TRECE");
								break;
							case 14:
								System.out.print("CATORCE");
								break;
							case 15:
								System.out.print("QUINCE");
								break;
							case 20:
								System.out.print("VEINTE");
						}
					}
			}else{
						System.out.println("NUMERO ERRONEO.");
			}
	}
}

