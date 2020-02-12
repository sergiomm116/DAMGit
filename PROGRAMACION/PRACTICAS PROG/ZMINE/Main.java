class Cuenta {
   protected double saldo;
   protected double ingreso;
   protected double retirada;
   protected double interes;
   protected double penalizacion;
   
   
   public double saldoGet(){
      return saldo;
   }
   
   public double Ingresar(){
      saldo = saldo + ingreso;
      return saldo;
   }
   
   public double Retirar(){
      saldo = saldo - retirada;
	  return saldo;
   }
   
   public double Intereses(){
	  
      saldo = saldo + (saldo * (interes/100));
	  return saldo;
   }
   
   
   
}
class Corriente extends Cuenta {
	
	
}
class Ahorro extends Cuenta {
	
	
}
class L2020 extends Cuenta {
	
	public double RetirarL(){
      saldo = saldo - (retirada * (penalizacion/100)) - retirada;
	  return saldo;
   }
	
}
class Main {
   public static void main(String[] args) {
      Corriente cuentaC = new Corriente();
      cuentaC.saldo = 1000;
      cuentaC.ingreso = 50;
      cuentaC.retirada = 20;
      cuentaC.Ingresar();
      cuentaC.Retirar();
      System.out.println("Corriente: "+cuentaC.saldoGet());
      
      Ahorro cuentaA = new Ahorro();
      cuentaA.saldo=1000;
      cuentaA.interes = 4;
      cuentaA.Intereses();
      System.out.println("Ahorro: "+cuentaA.saldoGet());
      
      L2020 cuentaL = new L2020();
		cuentaL.saldo = 1000;
		cuentaL.retirada = 100;
		cuentaL.interes = 8;
		cuentaL.penalizacion = 2;
		cuentaL.RetirarL();
		cuentaL.Intereses();
		System.out.println("2020: "+cuentaL.saldoGet());
      
  
   }
}
