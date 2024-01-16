import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pais pais1 = new Pais(12,"España");

        Estado estado1 = new Estado(1,"Valencia", pais1);

        Address ad1 = new Address("Avenida", "Benidorm", 23456, estado1);

        LibroAddress libro1 = new LibroAddress(830);

        Persona pers1 = new Persona("Hakeem", 9844321, "sb.hakeem");

        Persona pers2 = new Persona("Juanvi", 94321, "sb.eem");

        ArrayList<Persona> personas = new ArrayList<Persona>(5);
        personas.add(pers1);
        personas.add(pers2);

        LibroAddress libro2 = new LibroAddress(230, personas);

        System.out.println(ad1);
    }
}
