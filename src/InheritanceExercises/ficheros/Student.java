package InheritanceExercises.ficheros;

public class Student extends Person{
    int grade;

    public Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
    }

    public void study(){
        System.out.println("Nombre: " + getName() +
                " | Edad: " + getAge() +
                " | Grade: " + grade);
    }



}
