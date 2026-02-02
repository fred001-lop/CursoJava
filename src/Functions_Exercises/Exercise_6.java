package Functions_Exercises;

public class Exercise_6 {
    public static void main(String[] args) {
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        edad(18);
    }

    public static boolean edad (int a){
        if (a >= 18){
            System.out.println("Eres mayor de edad");
            return true;
        }else {
            System.out.println("No eres mayor de edad");
            return false;
        }

    }

}
