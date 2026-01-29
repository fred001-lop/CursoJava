package Exercises_Loops;

public class Exercise_4 {
    public static void main(String[] args) {
        //Recorre un array de 5 numeros e imprime la suma total

        int [] numeros = {1, 2, 3, 4,5};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];

        }
        System.out.println("La suma total es:" + suma);
    }
}
