public class Switch {
    public static void main(String[] args) {
        var day = 5;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            default:
                System.out.println("No es ninguno de los dias de la semana");
        }
    }
}
