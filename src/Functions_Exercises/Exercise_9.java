package Functions_Exercises;

public class Exercise_9 {
    public static void main(String[] args) {
        // 9. Escribe un método que reciba un número y retorna su factorial.
        int fac = 5;
        long result = factorial(fac);
        System.out.println("El factorial de:" +  fac + " Es :" + result);

    }

    public static long factorial(int numero){
        long resultado =1;

        for (int i = 1;  i <= numero; i++){
            resultado *= i;
        }
        return resultado;
    }

}
