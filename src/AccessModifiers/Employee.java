package AccessModifiers;

public class Employee {
    //ATRIBUTOS
    private double salary;

    //CONSTRUCTOR
    public Employee(double salary){
        this.salary = salary;
    }

    //setter


    public void setSalary(double salary) {
        this.salary = salary;
    }

    //metodo
    public void raiseSalary(double percent){
        if (percent >=  0){
            salary += salary * percent / 100;
            System.out.println("El monto es: " + salary);

        }else {
            System.out.println("No puedes ingresar cantidades negativas");
        }
    }


}
