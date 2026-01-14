package Exercises_2;

public class Exercise_1 {
    public static void main(String[] args) {
        //1--- Declara una variable de tipo String y asignale tu nombre
        String name = "Freddy";
        System.out.println(name);
        //2-- Crea una variable de tipo int y asignale tu edad
        int edad = 26;
        System.out.println(edad);
        //3-- Crea una variable double con la altura en metros
        double altura = 1.77;
        System.out.println(altura);
        //4-- Declara una variable tipo boolean que indique si te gusta programar
        boolean meGustaProgramar = true;
        System.out.println("Me gusta programar?: " + meGustaProgramar );
        //5-- Declara una constante con tu email
        final String email = "Fredygutierrez@gmail.com";
        System.out.println(email);
        //6-- Crea una variable tipo char y guardale tu inicial
        char initial = 'F';
        System.out.println("Mi inicial es: " + initial);
        //7-- Declara una variable de tipo String con tu localidad y a continuacion su valor y vuelve a imprimirla
        String localidad = "Mayuelas";
        System.out.println(localidad);
        localidad = "Zacapa";
        System.out.println(localidad);
        //8-- Crea una variable int llamada a, otra b, e imprime la suma de ambas
        int a = 5;
        int b = 10;
        int total = a + b;
        System.out.println(total);

        //9-- Intenta declarar una variable sin inicializarla y luego asignale un valor antes de imprimirla
        //Lo pedido no funciona debido a que se requiere asignar a la variable
        // valor = "No se puede";
    }
}
