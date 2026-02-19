package InheritanceExercises.ficheros;

public class Person {
    //ATRIBUTOS
    private String name;
    private int age;

    //CONSTRUCCTOR
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getter

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

}
