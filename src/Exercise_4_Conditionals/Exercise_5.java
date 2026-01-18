package Exercise_4_Conditionals;

public class Exercise_5 {
    public static void main(String[] args) {
        //Verifica si un numero esta en el rango del 1 al 100

        int numero = 111;

        if (numero >= 1 && numero <= 100){
            System.out.println("El numero esta dentro del rango 1 a 100: \n" +numero);
        }else {
            System.out.println("El numero esta fuera del rango" + numero);
        }
    }
}
