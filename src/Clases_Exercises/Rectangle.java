package Clases_Exercises;

public class Rectangle {

    //ATRIBUTOS

    int base;
    int altura;

    //CONSTRUCTOR
    public Rectangle(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //METODO

    public int calcularArea(){
        return  base * altura;
    }

    public int calcularPerimetro(){
      return 2 * (base + altura);
    }

}
