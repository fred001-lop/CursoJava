package Clases_Exercises;

public class Car {

    //ATRIBUTOS
    String brand;
    String model;
    //CONSTRUCTORES

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }


    //METODOS
    public  void showData(){
        System.out.println("La marca del carro es: " + brand + " El modelo es: " + model );

    }




}
