package AccessModifiers;

public class Rectangle {
    //ATRIBUTOS
    private double width;
    private double height;

    //CONSTRUCTOR
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }


    //setter

    public void setWidth(double width) {
        this.width = width;
    }
    public  void  setHeight(double height){
        this.height = height;
    }

    //metodo
    public double calculateArea(){
        double resultado = width * height;
        System.out.println("El resultado del rectangulo es: " + resultado);
        return resultado;


    }



}
