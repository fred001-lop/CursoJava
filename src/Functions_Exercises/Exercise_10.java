package Functions_Exercises;

import java.util.ArrayList;

public class Exercise_10 {
    public static void main(String[] args) {
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> list = new ArrayList<>();
        list.add("Fredy");
        list.add("Gerardo");
        list.add("Lopez");

        arrayin(list);
    }


    public static void arrayin(ArrayList<String>lista){
        for (int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

    }

}
