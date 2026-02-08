package Clases_Exercises;

public class Exercise_7 {
    public static void main(String[] args) {
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var calcu =  new Rectangle(2, 4);
        int area = calcu.calcularArea();
        int peri = calcu.calcularPerimetro();
        System.out.println("Calculando el area y perimetro de un Rectangulo");
        System.out.println("El area es: " + area );
        System.out.println("El perimetro es: " + peri );
    }
}
