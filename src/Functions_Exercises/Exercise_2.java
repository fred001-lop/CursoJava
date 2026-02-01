package Functions_Exercises;

public class Exercise_2 {
    public static void main(String[] args) {
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.

        sendMessage("Fredy");

    }

    public static void sendMessage(String person){
        System.out.println("Hola " + person + "!");
    }
}
