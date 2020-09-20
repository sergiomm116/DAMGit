import java.util.Scanner;

class Monedero{
    Scanner input = new Scanner(System.in);
    private double saldo;

    public Monedero(double saldo) {
        this.saldo = saldo;
        System.out.println("Monedero creado con saldo: "+getSaldo()+"€");
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double i){
        saldo += i;
        System.out.println("Operacion completada. Saldo actual: "+getSaldo()+"€");
    }
    public void sacar(double s){
        if(s < this.saldo){
            saldo -= s;
            System.out.println("Operacion completada. Saldo actual: "+getSaldo()+"€");
        }else{
            System.out.println("AVISO: Su cuenta quedara en negativo. ¿Desea proceder? (S/N)");
            boolean salir = false;
            while(salir==false) {
                switch (input.nextLine()) {
                    case "S":
                        saldo -= s;
                        salir = true;
                        System.out.println("Operacion completada. Saldo actual: "+getSaldo()+"€");
                        break;
                    case "N":
                        System.out.println("Operacion cancelada.");
                        salir = true;
                        break;
                    default:
                        System.out.println("Error. Introduzca S o N.");
                }
            }
        }
    }
}
public class Ejercicio9R {
    public static void main(String[] args) {
        System.out.print("Introduce el saldo incial del monedero: ");
        Scanner input = new Scanner(System.in);
        double c = input.nextDouble();
        Monedero m1 = new Monedero(c);
        boolean salir = false;
        System.out.print("\n1. Ingresar dinero. \n2. Sacar dinero. \n3. Salir.\n");
        while(salir==false){
            switch(input.nextInt()){
                case 1:
                    System.out.print("Introduce la cantidad a ingresar: ");
                    m1.ingresar(input.nextDouble());
                    break;
                case 2:
                    System.out.print("Introduce la cantidad a sacar: ");
                    m1.sacar(input.nextDouble());
                    break;
                case 3:
                    salir = true;
                    System.out.println("Sesion finalizada.");
                    break;
                default:
                    System.out.print("a");
            }
        }

    }
}
