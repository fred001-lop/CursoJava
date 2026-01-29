package Exercises_Loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Exercise_6 {
    public static void main(String[] args) {
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        //Recorriendo un HashSet
        HashSet<String> names = new HashSet<>();
        names.add("Fredy");
        names.add("Gerardo");
        names.add("Lopez");

        for (String name: names){
            System.out.println(name);
        }

        System.out.println("----------------------");
        System.out.println("----------------------");
        //Recorriendo un HashMap
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Fred");
        mapa.put(2, "Robert");
        mapa.put(3, "Cesar");

        for (Map.Entry<Integer, String> entrada : mapa.entrySet()){
            System.out.println(entrada.getKey() + entrada.getValue());
        }
    }
}
