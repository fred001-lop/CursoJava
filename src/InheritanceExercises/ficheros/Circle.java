package InheritanceExercises.ficheros;

public class Circle extends Shape{
    private double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }


    @Override
     public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
