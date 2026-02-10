package Clases_Exercises;

public class Worker {
    //atributos
    String nombre;
    int salario;

    // constructos
    public Worker(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }


    //metodo
    public void showDatos(){
        System.out.println("Salario de " + nombre +": " + salario);
    }
}
