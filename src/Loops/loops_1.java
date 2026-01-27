package Loops;

import java.util.HashSet;

public class loops_1 {
    public static void main(String[] args) {
        //For
        for (int i = 0; i < 5; i++){
            System.out.println("Hola, Java!");
        }

        String [] names = {"Fredy","Gerardo", "Gutierrez"};
        for(int index = 0; index < names.length; index++){

            System.out.println(names[index]);
        }

        //For-each
        for (String name:names){
            System.out.println(name);
        }
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer numero: numbers){
            System.out.println(numero);
        }
    }
}
