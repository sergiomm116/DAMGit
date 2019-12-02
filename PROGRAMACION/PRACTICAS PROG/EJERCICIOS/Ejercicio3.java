import java.util.Scanner;

public class Ejercicio3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    	
    	System.out.print("Introduce el importe en euros (si tiene decimales separalos por una coma): ");
		double e = input.nextDouble();
				
			double quin =((int)e/500);
				System.out.println("Billetes de 500e: "+quin);
			
			double dosc =((int)((e-500*quin)/200));			
				System.out.println("Billetes de 200e: "+dosc);
			
			double cien =((int)((e-500*quin-200*dosc)/100));			
				System.out.println("Billetes de 100e: "+cien);
			
			double cinc =((int)((e-500*quin-200*dosc-100*cien)/50));
				System.out.println("Billetes de 50e: "+cinc);			
    	
			double vein =((int)((e-500*quin-200*dosc-100*cien-50*cinc)/20));
				System.out.println("Billetes de 20e: "+vein);	
				
			double diez =((int)((e-500*quin-200*dosc-100*cien-50*cinc-20*vein)/10));
				System.out.println("Billetes de 10e: "+diez);	
				
			double cinco =((int)((e-500*quin-200*dosc-100*cien-50*cinc-20*vein-10*diez)/5));
				System.out.println("Billetes de 5e: "+cinco);	
			
			double dos =((int)((e-500*quin-200*dosc-100*cien-50*cinc-20*vein-10*diez-5*cinco)/2));
				System.out.println("Monedas de 2e: "+dos);
				
			double uno =((int)((e-500*quin-200*dosc-100*cien-50*cinc-20*vein-10*diez-5*cinco-2*dos)/1));
				System.out.println("Monedas de 1e: "+uno);
				
			double resto =(((e-500*quin-200*dosc-100*cien-50*cinc-20*vein-10*diez-5*cinco-2*dos-1*uno)/1));
				System.out.println("Resto en centimos: "+ String.format("%.2f", resto) +"e");
  }
}

