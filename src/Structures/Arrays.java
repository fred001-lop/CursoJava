package Structures;

public class Arrays {
    public static void main(String[] args) {
        //Declaracion y creacion
        int [] numbers = new int[3];

        String [] nombres = {"Fredy", "Gerardo", "Black"};
        System.out.println(nombres);


        //accesos
        System.out.println(nombres[1]);

        //
        System.out.println(numbers[0]);
        System.out.println(nombres[0]);
        System.out.println((new String[2])[0]);

        //Modificacion
        numbers[0] =1;
        numbers[1] =10;
        numbers[2] = 5;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(nombres[1]);
        nombres[1] = "Fredy@gmail.con";
        System.out.println(nombres[1]);
        nombres[1] = null;

    }
}
