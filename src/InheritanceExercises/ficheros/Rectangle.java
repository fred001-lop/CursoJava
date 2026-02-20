package InheritanceExercises.ficheros;

public class Rectangle extends Shape{
    //atributos
    private double width;
    private double height;

    //constructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    //metodo
    @Override
    public double calculateArea(){
        return width * height;
    }


}
