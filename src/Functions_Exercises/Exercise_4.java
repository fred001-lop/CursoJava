package Functions_Exercises;

public class Exercise_4 {
    public static void main(String[] args) {
        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        long resultado = cuadrado(5);
        System.out.println("El resultado del cuadrado es: " + resultado);
    }

    public static long cuadrado (long a){
        return a*a;
    }
}
