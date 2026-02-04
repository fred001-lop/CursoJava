package Clases_Exercises;

public class Book {

    //atributos
    String tittle;
    String author;
    //constructor

    public Book(String tittle, String author){
        this.tittle = tittle;
        this.author = author;
    }


    //metodo

    public void showDatos(){
        System.out.println("El nombre del libro es: " + tittle + "Y el autor es: " + author);
    }

}
