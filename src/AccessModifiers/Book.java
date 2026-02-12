package AccessModifiers;

public class Book {
    //ATRIBUTOSS
    private String title;

    //constructor
    public Book(String title){
        this.title = title;
    }

    //getter

    public String getTitle(){
        return title;
    }

    //metodo

    public void mostrar(){
        System.out.println("El titulo del libro es: " + getTitle());
    }

}
