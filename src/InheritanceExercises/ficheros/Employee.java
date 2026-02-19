package InheritanceExercises.ficheros;

public class Employee {

    //atributos
    private String name;
    private double salary;


    //CONSTRUCTOR
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //getter


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    //metodo
    public void showDatos(){
        System.out.println("Usuario: " + getName() + "Salario: " + getSalary());
    }

}
