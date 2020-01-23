public class String23 {

	public static void main (String args[]) {

		Scanner teclado = new Scanner (System.in);

		String facturas[] = new String[1];

		String codigo;

		int i=0;

		int litros = 0;

		int precio = 0;

		do {

			System.out.print("Codigo: ");

			codigo=teclado.nextLine();
	
			if (factura.equals("0")) {

				break;

			}

			facturas[i] = codigo+"*";

			System.out.print("Litros: ");

			litros = Integer.parseInt(teclado.nextLine());

			facturas[i]+=litros+"*";

			System.out.print("Precio/Litro: ");

			precio = Double.parseDouble(teclado.nextLine());

			facturas[i]+=precio+"*";

			facturas[i]+=(litros*precio);

			facturas=Arrays.copyOf(facturas,i+2);

			i++;

		} while (true);

		for (String valor:facturas) {

			System.out.println(valor.substring(valor.lastIndexOf("*")+1, valor.length()-1));

			System.out.println(valor);

		}

	}

}