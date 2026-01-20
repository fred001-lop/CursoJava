package Structures;

import javax.xml.namespace.QName;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        //Declaracion y creacion
        HashSet <String> nombres = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //Tamano
        System.out.println(nombres.size());

        //anadir elementos
        nombres.add("Fredy");
        nombres.add("Gerardo");
        nombres.add("Lopez");
        System.out.println(nombres.size());

        //acceder a los elementos
        //No se puede acceder a los elementos, debido a que estan desordenados

        //buscar elememtos
        System.out.println(nombres.contains("Fredy"));
        System.out.println(nombres.contains("Lopez"));

        //Eliminar elementos

        nombres.remove("Fredy");
        System.out.println(nombres.size());


        //No se puede agregar varias cosas similares

        System.out.println(nombres);
        nombres.add("Fredy");
        nombres.add("Fredy");
        nombres.add("Fredy");
        nombres.add("Fredy");

        System.out.println(nombres);

        //nombres.addAll(numbers); Error debido a que no son compatibles

        var countries = new HashSet<String>();
        countries.add("Guatemala");
        countries.add("Espana");
        countries.add("Paris");

        nombres.addAll(countries);
        System.out.println(nombres);


        nombres.removeAll(countries);
        System.out.println(nombres);
        nombres.retainAll(countries);
        System.out.println(nombres);


    }
}
