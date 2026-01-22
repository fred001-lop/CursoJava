package Exercises_Arrays;

import java.util.ArrayList;

public class Exercise_2 {
    public static void main(String[] args) {
        //Crea un arrayList vacio
        ArrayList<String>  names = new ArrayList<>();
        //añade 4 valores al arrayList
        names.add("Fredy");
        names.add("Gerardo");
        names.add("Gutierrez");
        names.add("Lopez");
        System.out.println(names);
        //elimina uno a continuacion
        names.remove("Fredy");
        System.out.println(names);



    }
}
