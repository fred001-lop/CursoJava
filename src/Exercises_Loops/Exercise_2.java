package Exercises_Loops;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_2 {
    public static void main(String[] args) {
        //Usa do-while para mostrar todos los valores de un array list
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Fredy");
        nombres.add("Roberto");
        nombres.add("Gerardo");

        int i = 0;

        do{
            System.out.println(nombres.get(i));
            i++;
        }while (i < nombres.size());


    }
}
