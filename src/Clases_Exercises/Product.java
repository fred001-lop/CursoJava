package Clases_Exercises;

public class Product {
    //ATRIBUTOS
    String nombre;
    int precio;

    //CONSTRUCTOr

    public Product(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplircarDescuent(){
        precio -= precio * 5 /100;


    }

}
