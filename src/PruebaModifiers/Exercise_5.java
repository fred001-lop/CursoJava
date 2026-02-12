package PruebaModifiers;

import AccessModifiers.Temperature;

public class Exercise_5 {
    public static void main(String[] args) {
        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        var cel = new Temperature(10);
        System.out.println(cel.getCelcius());

    }
}
