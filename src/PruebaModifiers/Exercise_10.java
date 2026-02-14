package PruebaModifiers;

import AccessModifiers.Car;

public class Exercise_10 {
    public static void main(String[] args) {
        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var car = new Car();
        System.out.println("Velocidad inicial" + car.getSpeed());
        car.accelerate(100);
        System.out.println("Velocidad despues de agreagar speed " + car.getSpeed());
        car.accelerate(50);
        System.out.println("Velocidad despues de agreagar speed " + car.getSpeed());
        
    }
}
