package Exercise_4_Conditionals;
//Declara una variable con el dia de la semana (1-7) y muestra su nombre con un switch
public class Exercise_6 {
    public static void main(String[] args) {
        int semana = 8;

        switch (semana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Has ingresado un numero fuera del rango");
        }
    }
}
