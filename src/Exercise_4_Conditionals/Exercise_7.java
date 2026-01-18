package Exercise_4_Conditionals;

public class Exercise_7 {
    public static void main(String[] args) {
        //Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o suspenso
        //segun la nota de 0 a 100
        int nota = 91;
        if (nota >= 91){
            System.out.println("Su nota es sobresaliente");
        } else if (nota >= 61) {
            System.out.println("Su nota ha sido Aprobada");
        }else {
            System.out.println("Su nota es Suspenso");
        }
    }
}
