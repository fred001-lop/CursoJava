package InheritanceExercises;

import InheritanceExercises.ficheros.Bird;
import InheritanceExercises.ficheros.Eagle;

public class Exercise_6 {
    public static void main(String[] args) {
        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        Eagle ave = new Eagle();
        ave.fly();
    }
}
