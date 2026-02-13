package PruebaModifiers;

import AccessModifiers.Employee;

public class Exercise_7 {
    public static void main(String[] args) {
        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        var salary = new Employee(2000);
        salary.raiseSalary(10);
    }
}
