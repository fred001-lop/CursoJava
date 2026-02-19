package InheritanceExercises;

import InheritanceExercises.ficheros.Animal;
import InheritanceExercises.ficheros.cat;
import InheritanceExercises.ficheros.dog;

public class Exercise_3 {
    public static void main(String[] args) {
        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.

      Animal mascota = new dog();
      mascota.makeSound();
      Animal mascota2 = new cat();
      mascota2.makeSound();

    }
}
