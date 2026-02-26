package Polymorphis;

import AccessModifiers.Car;

public class Polimorfismo {
    public static void main(String[] args) {
        //Polimorfismo
        //Polimorfismo por herencia (sobrescritura)
        var animal = new Animal();
        animal.sound();

        var perro = new Dog();
        perro.sound();

        //polimorfismo por sobrecarga (sobrecarga de metodos)
        var calculadora = new Calculator();
        System.out.println(calculadora.summ(7.5,7.6));
        System.out.println(calculadora.summ(5,4));

    }
    public static class Animal{
        public void sound(){
            System.out.println("Algun sonido");
        }
    }
    public static class Dog extends  Animal{
        @Override
        public void sound() {
            System.out.println("Guau");
        }
    }

    public static class Calculator{
        public int summ (int a, int b){
            return a + b;
        }

        public double summ(double a, double b){
            return a + b;
        }

        public int summ(int a, int b, int c){
            return a + b + c;
        }

    }
}
