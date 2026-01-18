package Exercise_4_Conditionals;

public class Exercise_8 {
    public static void main(String[] args) {
        //Escribe un programa que determine si puedes entrar al cine, debes tener al menos 15 años o ir acompañado

        int edad = 14;
        boolean acompa = false;


        if (edad >= 15 || acompa == true){
            System.out.println("Puedes entrar al cine");
        }else {
            System.out.println("Eres menor, no estas autorizado");
        }

    }
}
