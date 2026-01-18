package Exercise_4_Conditionals;

public class Exercise_10 {
    public static void main(String[] args) {
        //Usa tres variables a,b,c y muestra cual es la mayor de las 3

        int a = 4;
        int b = 3;
        int c = 4;

        if (a > b && a > c){
            System.out.println("La letra a es mayor");
        } else if (b > a && b > c) {
            System.out.println("La letra b es mayor");
        } else if (c > a && c > b) {
            System.out.println("La letra c mayor");

        } else {
            System.out.println("Hay dos valores iguales y mayores");
        }
    }
}
