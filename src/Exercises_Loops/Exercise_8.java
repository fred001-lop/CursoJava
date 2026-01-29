package Exercises_Loops;

public class Exercise_8 {
    public static void main(String[] args) {
        //Usa continue para saltar los multiplos de 3 del 1 al 20
        for (int i = 1; i <=20; i++){
            if (i % 3 == 0){
                continue;
            }
                System.out.println(i);


        }
    }
}
