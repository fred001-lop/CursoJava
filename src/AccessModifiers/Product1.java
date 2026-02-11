package AccessModifiers;

public class Product1 {
    //ATRIBUTOS
    private String nameProduct;
    private double price;

    //CONSTRUCTOR
    public Product1(String nameProduct, double price){
        this.nameProduct = nameProduct;
        this.setPrice(price);
    }


    //GETTERS Y SETTERS

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    //METODOS

    public void setPrice(double price){
        if (price > 0){
            this.price = price;
           System.out.println("ACEPTADO");
        }else {
            System.out.println("El precio debe ser mayor a 0");
        }
    }

    public void sayDatos(){
        System.out.println("El producto: " +" " + getNameProduct() + " Su precio: " + getPrice());
    }

}
