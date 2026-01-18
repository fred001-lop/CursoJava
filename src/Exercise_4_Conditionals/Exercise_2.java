package Exercise_4_Conditionals;

public class Exercise_2 {
    public static void main(String[] args) {
        //Declara dos numeros y muestra cual es el mayor o si son iguales
        var number1 = 18;
        var number2 = 18;

        if (number1 > number2){
            System.out.println("el numero mayor es:" + number1);


        } else if (number2 > number1) {
            System.out.println("El numero mayor es: " + number2);
        } else {
            System.out.println("Son iguales");
        }
    }
}
