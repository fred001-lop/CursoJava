package Structures;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        //Declaracion y Creacion
        //Declaracion vieja
        ArrayList<String> names = new ArrayList<>();
        //Delaracion nueva
        var number = new ArrayList<Integer>();


        //tamano
        System.out.println(names.size());

        //anadiendo elementos
        names.add("Fredy");
        names.add("Lopez");
        names.add("Gerardo");
        //Accediendo a los elementos
        System.out.println(names.size() );
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        //modificar los elementos
        names.set(2, "fredylopez@gmail.com");
        System.out.println(names.get(2));

        //ELiminar
        names.remove(2);
//        System.out.println(names.get(2));

        //Buscar elementos

        System.out.println(names.contains("Fredy"));
        System.out.println(names.contains("fredylopez@gmail.com"));

        //Limpiar arrayList
        names.clear();
        System.out.println(names.size());
    }
}
