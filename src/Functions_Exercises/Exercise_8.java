package Functions_Exercises;

public class Exercise_8 {
    public static void main(String[] args) {
        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

        int [] numero = {2,4,5,6};
        double resultado = media(numero);
        System.out.println("El resultado es:" + resultado);



    }

    public static double media(int [] array){

        int suma = 0;

        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return (double) suma / array.length;
    }




}
