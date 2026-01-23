package Exercises_Arrays;

import java.util.HashMap;

public class Exercise_4 {
    public static void main(String[] args) {
        //Crea un HashMap donde la clave sea un noombre  el valor el numero de telefono. Añade 3 contactos
        var nombre =  new HashMap<String, Integer>();
        nombre.put("Fredy", 123456);
        nombre.put("Robert", 123);
        nombre.put("Diana",  456);
        System.out.println(nombre);
        //Modifica uno de los contactos y elimina otro
        nombre.replace("Robert", 123, 444);
        System.out.println(nombre);
        //Elimina otro
        nombre.remove("Fredy");
        System.out.println(nombre);



    }
}
