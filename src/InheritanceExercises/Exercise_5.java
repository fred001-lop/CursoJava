package InheritanceExercises;

import InheritanceExercises.ficheros.Circle;
import InheritanceExercises.ficheros.Rectangle;
import InheritanceExercises.ficheros.Shape;

import java.awt.*;

public class Exercise_5 {
    public static void main(String[] args) {
        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
       Shape circle = new Circle(5);
        System.out.println("Area de un circulo: "+ circle.calculateArea());
        Shape rectangle = new Rectangle(4,5);
        System.out.println("Area de un rectangulo: "+ rectangle.calculateArea());

    }
}
