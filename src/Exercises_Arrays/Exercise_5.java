package Exercises_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Exercise_5 {
    public static void main(String[] args) {
        //Dado un array, transformalo en un arraylist, a continuacion en un HashSet y finalmente en un HashMap con  clave y valor iguales
        String[] array = {"uno", "dos", "tres", "dos"};

        //Convertir el array en un arrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        //convirtiendo el arrayList en un HashSet
        HashSet<String> hashSet = new HashSet<>(arrayList);
        // 4. HashSet -> HashMap (clave = valor)
        HashMap<String, String> hashMap = new HashMap<>();
        for (String elemento : hashSet) {
            hashMap.put(elemento, elemento);
        }
        //Mostrar resultados
        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("HashMap: " + hashMap);
        

    }
}
