package Structures;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        //Declaracion y creacion

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        //Tamaño
        System.out.println(names.size());

        //añadir elementos
        names.put("Fredy", "fredy@gmail.com" );
        names.put("Gerardo", "gerardo@gmail.com" );
        names.put("Lopez", "lopez@gmail.com" );
        System.out.println(names.size());
        System.out.println(names);
    }
}