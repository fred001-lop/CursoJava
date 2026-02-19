package InheritanceExercises.ficheros;

public class Manager extends Employee{

    //ATRIBUTO
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void showDatos(){

        super.showDatos();
        System.out.println("Departamento: " + department);

     }



}
