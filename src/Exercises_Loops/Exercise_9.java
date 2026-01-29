package Exercises_Loops;

public class Exercise_9 {
    public static void main(String[] args) {
        //Usa un break para detener un bucle cuando encuentres un numero negativo en un array
        int [] numeros = {1, 2, 3, -5, 8, 10};

        for (int num: numeros){
            if (num  < 0){
                break;

            }
            System.out.println(num);
        }
    }
}
