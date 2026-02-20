package InheritanceExercises;

import InheritanceExercises.ficheros.Animmal;
import InheritanceExercises.ficheros.Birdd;
import InheritanceExercises.ficheros.Catt;
import InheritanceExercises.ficheros.Dogg;

import java.util.ArrayList;

public class Exercise_10 {
    public static void main(String[] args) {
        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        ArrayList<Animmal> animals = new ArrayList<>();

        //añadir
        animals.add(new Dogg());
        animals.add(new Catt());
        animals.add(new Birdd());

        //recorrer la lista
        for (Animmal a: animals){
            a.makeSoundd();
        }
    }
}
