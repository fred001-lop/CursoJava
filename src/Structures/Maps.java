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

        //Acceder a los elementos

        System.out.println(names.get("Fredy"));
        //Verificar elementos
        System.out.println(names.containsKey("roberto"));

        System.out.println(names.containsValue("fredy@gmail.com"));

        //eliminar elementos
        names.remove("Fredy");
        System.out.println(names.size());
        System.out.println(names);

        //reemplaza el valor si existe
        names.replace("Gerardo", "gerardo1111@gmail.com");
        System.out.println(names);

        //solo agrega si no existe
        names.putIfAbsent("Roberto", "robert@gmail.com");
        System.out.println(names);

        //va comprobar si esta vacia o no
        System.out.println(names.isEmpty());

        var values = names.values();
        System.out.println(values);


    }
}