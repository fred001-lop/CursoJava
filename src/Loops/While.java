package Loops;

public class While {
    public static void main(String[] args) {
//        int index = 0;
//        String [] names = {"Fredy","Gerardo", "Gutierrez"};
//        while (index < names.length){
//            System.out.println(names[index]);
//            index++;
//            if (names[index].equals("Fredy")){
//
//                index+=2;
//
//            }
//        }


        //do while
        String [] names = {"Fredy","Gerardo", "Gutierrez"};
        int index = 0;
        boolean find = false;
        while (!find){
            System.out.println(names[index]);
            if (names[index].equals("Fredy")){
                find= true;
            }
            index++;
        }




        int index2 = 0;
        do{
            System.out.println("Hola, java!");
            index2++;
        }while (index2 < 0);
        //control de bucles
        //- break
        for (String nombre:names){
            if (nombre.equals("Fredy")) {
             break;
            }
            System.out.println(nombre);
        }
        //-- continue

        for (int i = 0; i < 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
