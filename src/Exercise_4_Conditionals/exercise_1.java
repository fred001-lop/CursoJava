package Exercise_4_Conditionals;

public class exercise_1 {
    public static void main(String[] args) {
        //Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18)
        var age = 15;
        if(age >= 18){
            System.out.println("Puedes votar");
        }else {
            System.out.println("Lo siento, no puedes votar");
        }
    }
}
