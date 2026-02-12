package PruebaModifiers;

import AccessModifiers.Book;

public class Exercise_4 {
    public static void main(String[] args) {
        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var libro = new Book("Harry Potter");
        libro.mostrar();

    }
}
