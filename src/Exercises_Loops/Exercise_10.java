package Exercises_Loops;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        // // 10. Crea un programa que calcule el factorial de un número dado.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su numero:");
        int nume = scanner.nextInt();

        long factorial = 1;

        for(int i = 1; i <= nume; i++){
            factorial *= i;
        }

        System.out.println("El factorial de: " + nume + "Es" + factorial);
        scanner.close();

    }
}
