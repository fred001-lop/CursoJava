package PruebaModifiers;

import AccessModifiers.Product1;
import Clases_Exercises.Product;

public class Exercise_2 {
    public static void main(String[] args) {
        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var obtener = new Product1("Carne", 100);
        obtener.sayDatos();

    }
}
