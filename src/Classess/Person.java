package Classess;

public class Person {
    //Atributos
    protected String name;
    private int age;
    final private String id;

    //constructor
    public Person(String name, int age, String id){
        this.name = name;
        this.setAge(age);
        this.id = id;

    }


    //metodos
    public void SayHello(){
        System.out.println("Hola soy: " + name +" Mi edad es: " + age + " Y mi id es: " + id
        );
    }

    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age > 0 ){
            this.age = age;
        }else {
            System.out.println("Edad no valida");
        }
    }

}
