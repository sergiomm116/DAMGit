import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapaTriple {

    static HashMap<String, String> primerMapa;
    static HashMap<String, Integer> segundoMapa;
    static HashMap<Integer, String> tercerMapa;

    MapaTriple() {                                         //Constructor

        primerMapa = new HashMap<String, String>();
        segundoMapa = new HashMap<String, Integer>();
        tercerMapa = new HashMap<Integer, String>();

    }

    public void inserta(String dni, int segsocial, String nombre) throws Exception {

        if (primerMapa.containsKey(dni) || tercerMapa.containsKey(segsocial)) {
            throw new Exception("Ya existe");
        }

        primerMapa.put(dni, nombre);
        segundoMapa.put(dni, segsocial);
        tercerMapa.put(segsocial, nombre);

    }

    public void elimina(String dni, int segsocial) throws Exception {

        if (!primerMapa.containsKey(dni) || !tercerMapa.containsKey(segsocial)) {
            throw new Exception("No existe");
        }

        primerMapa.remove(dni);
        segundoMapa.remove(dni);
        tercerMapa.remove(segsocial);

    }

    public int segsocial(String dni) throws Exception {

        if (!primerMapa.containsKey(dni)) {
            throw new Exception("No existe");
        }

        return segundoMapa.get(dni);

    }

    public String dni(int segsocial) throws Exception {

        if (!tercerMapa.containsKey(segsocial)) {
            throw new Exception("No existe");
        }

        String _nombre = tercerMapa.get(segsocial);

        boolean _encontrado = false;

        Iterator it = primerMapa.entrySet().iterator();         //Puntero que apunta a la primera variable del mapa

        while (!_encontrado && it.hasNext()) {

            HashMap.Entry _par = (HashMap.Entry) it.next();

            if (_par.getValue().equals(_nombre) && segundoMapa.get(_par.getKey()) == segsocial) {

                _encontrado = true;
                return _par.getKey().toString();

            }

        }

        return null;

    }

    public String dni(String nombre) throws Exception {

        if (!primerMapa.containsValue(nombre)) {
            throw new Exception("No existe");
        }

        String _string = "";

        Iterator it = primerMapa.entrySet().iterator();         //Puntero que apunta a la primera variable del mapa

        while (it.hasNext()) {

            HashMap.Entry _par = (HashMap.Entry) it.next();

            if (_par.getValue().equals(nombre)) {

                _string += _par.getKey().toString() + " ";

            }

        }

        return _string;

    }

    public void muestra() {

        for (String i : primerMapa.keySet()) {
            System.out.println(i + " - " + segundoMapa.get(i) + " - " + primerMapa.get(i));
        }

    }
}

class Pacientes {

    private static void menu() throws IOException {

        int c = System.in.read();


    }

    public static void main(String[] args) throws IOException {

        MapaTriple mt = new MapaTriple();
        Scanner in = new Scanner(System.in);
        String [] entry;
        String _dni, _nom;
        int _ss;

        int c = -1;
        while (c != 7) {
            System.out.println("Selecciona una opcion: \n 1. Insertar paciente \n 2. Eliminar paciente \n 3. Buscar por DNI \n 4. Buscar por numero de seguridad social \n 5. Buscar por nombre\n 6. Listar pacientes \n 7. Salir ");
            c = Integer.parseInt(in.nextLine());
            try {
                switch (c) {
                    case 1:
                        System.out.print("Introduce nombre, dni y seguridad social con el siguiente formato (nombre dni segsocial): ");
                        entry = in.nextLine().split(" ");
                        _nom = entry[0];
                        _dni = entry[1];
                        _ss = Integer.parseInt(entry[2]);
                        mt.inserta(_dni, _ss, _nom);
                        System.out.println("Entrada guardada");
                        break;
                    case 2:
                        System.out.print("Introduce dni y seguridad social con el siguiente formato (dni segsocial): ");
                        entry = in.nextLine().split(" ");
                        _dni = entry[0];
                        _ss = Integer.parseInt(entry[1]);
                        mt.elimina(_dni, _ss);
                        System.out.println("Entrada eliminada");
                        break;
                    case 3:
                        System.out.print("Introduce dni: ");
                        mt.segsocial(in.nextLine());
                        break;
                    case 4:
                        System.out.print("Introduce seguridad social: ");
                        System.out.println(mt.dni(Integer.parseInt(in.nextLine())));
                        break;
                    case 5:
                        System.out.print("Introduce nombre: ");
                        System.out.println(mt.dni(in.nextLine()));
                        break;
                    case 6:
                        mt.muestra();
                        break;
                    default:
                        System.out.println("Error en la entrada");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
