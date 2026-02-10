package Clases_Exercises;

public class Exercise_10 {
    public static void main(String[] args) {
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var descuento = new Product("Carne", 40);
        descuento.aplircarDescuent();
        System.out.println("Precio descuento: " + descuento.precio);
        var descuento1 = new Product("Repollo", 20);
        descuento1.aplircarDescuent();
        System.out.println("Producto:" + descuento1.nombre + "  Total con descuento: " + descuento1.precio);

    }
}
