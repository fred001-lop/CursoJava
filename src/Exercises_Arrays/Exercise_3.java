package Exercises_Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Exercise_3 {
    public static void main(String[] args) {
        //Crea un HashSet con 2 valores diferentes

        HashSet<String> nombres = new HashSet<>();
        nombres.add("Fredy");
        nombres.add("Gerardo");
        //Añade un nuevo valor repetido  otro sin repetir al Hashset
        nombres.add("Fredy");//no acepta valores repetidos
        nombres.add("Carlos");
        System.out.println(nombres);
        //elimina uno de los valores del hashset
        nombres.remove("Carlos");
        System.out.println(nombres);

    }
}
