package InheritanceExercises.ficheros;

public class Eagle extends Bird{


    @Override
    public void fly() {
        super.fly();
        System.out.println("El Aguila vuela mas rapido");
    }
}
