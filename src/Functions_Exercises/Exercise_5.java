package Functions_Exercises;

public class Exercise_5 {
    public static void main(String[] args) {
        // 5. Escribe una función que reciba un número y diga si es par o impar.


        numero(4);
    }
    public static boolean numero(int a){

        if (a % 2 == 0){
            System.out.println("El numero es par");
            return true;
        }
        System.out.println("El numero es impar");
        return false;

    }
}
