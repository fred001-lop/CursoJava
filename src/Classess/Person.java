package Classess;

public class Person {
    //Atributos
    String name;
    int age;

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }


    //metodos
    public void SayHello(){
        System.out.println("Hola soy: " + name +" Mi edad es: " + age);
    }


}
