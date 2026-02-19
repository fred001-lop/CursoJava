package InheritanceExercises;

import InheritanceExercises.ficheros.Person;
import InheritanceExercises.ficheros.Student;

public class Exercise_2 {
    public static void main(String[] args) {
        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().

        var prueba = new Student("Fredy", 26, 5);
        prueba.study();
    }
}
