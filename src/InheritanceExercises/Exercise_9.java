package InheritanceExercises;

import InheritanceExercises.ficheros.*;

public class Exercise_9 {
    public static void main(String[] args) {
        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        var vehiculo = new Camion();
        var vehiculo2 = new Bicicleta();
        var vehiculo3 = new Carro();
        var vehiculo4 = new Vehicle2();
        vehiculo.describe();
        vehiculo2.describe();
        vehiculo3.describe();
        vehiculo4.describe();



    }
}
