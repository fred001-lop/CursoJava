package PruebaModifiers;

import AccessModifiers.Rectangle;

public class Exercise_8 {
    public static void main(String[] args) {
        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rectangulo = new Rectangle(10, 20);
        rectangulo.calculateArea();
    }
}
