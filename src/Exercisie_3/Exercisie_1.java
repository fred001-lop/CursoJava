package Exercisie_3;

public class Exercisie_1 {
    public static void main(String[] args) {
        //1- Crea una variable con el resultado de cada operacion aritmetica
        //Operacion aritmetica

        float a = 5;
        var b = 3;

        float suma = a + b;
        float resta = a - b;
        float multi = a * b;
        double divi = a / b;
        double residuo = a % b;


        System.out.println("Resultado de suma: " + suma);
        System.out.println("Resultado de resta: " + resta);
        System.out.println("Resultado de multiplicacion: " + multi);
        System.out.println("Resultado de division: " + divi);
        System.out.println("Resultado de Residuo: " + residuo);


        //2- Crea una variable para cada tipo de operacion de asignacion
        a = b;
        a += b;
        a = b * 2;


        //3- Imprime 3 comparaciones verdaderas con diferentes operadores de comparacion
        //AND
        System.out.println(true && true);
        //OR
        System.out.println(true || false);
        //NOT
        System.out.println(!(false) || false);

        //4- Imprime 3 comparaciones falsas con 3 diferentes operadores de comparacion
        //AND
        System.out.println(false && true);
        //OR
        System.out.println(false && false);
        //not
        System.out.println(!(true) || false);

        //5- Utiliza el operador and

        System.out.println(5 > 3 && 5==2);

        //6- Utiliza el operador or
        System.out.println(5 > 3 || 3< 4);

        //7- combina ambos operadores logicos
        System.out.println(5 > 3 && 5==2 && 5 > 3 || 3< 4);

        //8- Añade alguna negacion
        System.out.println(!(5 > 3) && 5==2 && 5 > 3 || 3< 4);

        //9- Imprime 3 ejemplos de operadores unarios

        System.out.println("a++");
        System.out.println("++a");
        System.out.println("--a");
    }
}
