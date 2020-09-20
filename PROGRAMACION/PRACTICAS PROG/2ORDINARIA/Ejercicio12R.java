import java.util.Scanner;

class Persona implements Comparable<Persona> {

    double edad, altura;

    public Persona (double e, double a){
        this.edad = e;
        this.altura = a;
    }

    public int compareTo(Persona suj2) {

        if((this.edad/suj2.edad) != 1 && (this.altura/suj2.altura) != 1){
            return 0;
        }else if ((this.edad/suj2.edad) == 1 && (this.altura/suj2.altura) != 1){
            return 1;
        }else if ((this.edad/suj2.edad) != 1 && (this.altura/suj2.altura) == 1){
            return 2;
        }else if ((this.edad/suj2.edad) == 1 && (this.altura/suj2.altura) == 1){
            return 3;
        }

        return 99;
    }
}

public class Ejercicio12R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int edad, altura;

        System.out.print("Introduce la edad del Sujeto 1: ");
        edad = input.nextInt();
        System.out.print("\nIntroduce la altura del Sujeto 1: ");
        altura = input.nextInt();
        Persona suj1 = new Persona(edad, altura);

        System.out.print("\nIntroduce la edad del Sujeto 2: ");
        edad = input.nextInt();
        System.out.print("\nIntroduce la altura del Sujeto 2: ");
        altura = input.nextInt();
        Persona suj2 = new Persona(edad, altura);

        int n = suj1.compareTo(suj2);
        switch (n){
            case 0:
                System.out.println("\nLas personas tienen diferente edad y altura.");
                break;
            case 1:
                System.out.println("\nLas personas tienen misma edad y diferente altura.");
                break;
            case 2:
                System.out.println("\nLas personas tienen diferente edad y misma altura.");
                break;
            case 3:
                System.out.println("\nLas personas tienen misma edad y altura.");
                break;
            default:
                System.out.println("\nError.");
        }
    }
}