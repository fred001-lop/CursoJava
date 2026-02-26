package Polimorfismo_Exercise;
import java.util.List;
import java.util.ArrayList;

public class Exercise_1 {
    public static void main(String[] args) {
        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        List<Aniimall> animales = new ArrayList<>();

        animales.add(new Dogg());
        animales.add(new Catt());
        animales.add(new Coww());

        for (Aniimall animal : animales){
            animal.makeSound();
        }


    }
    public static class Aniimall{


        public void makeSound(){
            System.out.println("Hacer un sonido");
        }

    }

    public static class Dogg extends Aniimall{
        @Override
        public void makeSound() {
            System.out.println("Guaff");
        }
    }

    public static class Catt extends Aniimall{
        @Override
        public void makeSound() {
            System.out.println("Miauu");
        }
    }

    public static class Coww extends Aniimall{
        @Override
        public void makeSound() {
            System.out.println("Muuu");
        }
    }



}

