package Functions_Exercises;

public class Exercise_3 {
    public static void main(String[] args) {
//         3. Haz un método que reciba dos números enteros y devuelva su resta.

        int resultado = restar(4,2);
        System.out.println("El resultado de la resta es: " + resultado);

    }

    public static int restar(int a, int b){
        return a-b;
    }

}
