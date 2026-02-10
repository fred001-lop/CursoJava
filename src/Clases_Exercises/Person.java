package Clases_Exercises;

public class Person {
    //ATRIBUTOSS
    String name;
    int edad;

    //CONSTRUCTOR
    public Person(String name, int edad){
        this.name = name;
        this.edad = edad;
    }

    //METODO
    public void showDatosPerson(){
        System.out.println("Nombre: " + name + "  Edad: " + edad);
    }

}
