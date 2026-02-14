package PruebaModifiers;

import AccessModifiers.Student;

public class Exercise_9 {
    public static void main(String[] args) {
// 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var student1 = new Student(61);
        if (student1.isPassed()){
            System.out.println("APROBADO");
        }else {
            System.out.println("REPROBADO");
        }
    }
}
