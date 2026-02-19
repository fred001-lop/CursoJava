package InheritanceExercises;

import InheritanceExercises.ficheros.Employee;
import InheritanceExercises.ficheros.Manager;

public class Exercise_4 {
    public static void main(String[] args) {
// 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

        Employee nuevo = new Manager("Fredy", 1200,"RRHH");
        nuevo.showDatos();

    }
}
