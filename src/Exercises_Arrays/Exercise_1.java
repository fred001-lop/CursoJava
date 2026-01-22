package Exercises_Arrays;

public class Exercise_1 {
    public static void main(String[] args) {
        //Crea un array con 5 valores e imprime su longitud

        var numeros = new int[]{1, 2, 3, 4, 5};
        System.out.println(numeros.length);

        var nombres = new String[]{"Fredy", "Lopez"};
        System.out.println(nombres.length);

        //Modifica uno de los valores del array e imprime el valor del indice antes y despues de modificarlo

        System.out.println(nombres[0]);
        nombres[0] = "Roberto";
        System.out.println(nombres[0]);

    }
}
