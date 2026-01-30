package Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        //Funciones
        for (int i = 0; i < 5; i++){
            sendEmail();

        }


        sendEmailToUser("Fredygu@gmail.com");
        sendEmailToUser("Fredygu@gmail.com", "Fredy");
        var users = new ArrayList<String>(Arrays.asList("Fredy", "Kenia", "Robert"));
        sendEmailToUser(users);
        var state = sendEmailWithState("Fred@gamil.com");
        System.out.println(state);
        System.out.println(sendEmailWithState(""));
    }
    //FUNCIONES SIN RETORNO

    public static void sendEmail(){
        System.out.println("Enviar email");
    }


    //Funcion con parametros
    public static void sendEmailToUser(String email){
        System.out.println("Se envia el email a:" + email);
    }
    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envia el email a:" + name + "(" + email +")");
    }

    public static void sendEmailToUser(ArrayList<String> emails){
        for (String mail: emails){
            sendEmailToUser(mail);
        }
    }

    //Funciones con retorno
    public static boolean sendEmailWithState(String email){
        if(email.isEmpty()){
            return false;
        }
        System.out.println("Enviar email" + email);
         return true;
    }


}
