package Clases_Exercises;

import java.util.ArrayList;

public class Exercise_9 {
    public static void main(String[] args) {
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        ArrayList<Person> personas = new ArrayList<>();
        //CREANDO OBJETOS PERSON
        Person user1 = new Person("Fredy", 26);
        Person user2 = new Person("Keny", 20);
        Person user3 = new Person("Robert", 18);
        Person user4 = new Person("Dora", 49);
        //AGREGANDO AL ARRAY
        personas.add(user1);
        personas.add(user2);
        personas.add(user3);
        //hacer ciclo for, para mostar datos
        for (Person p: personas){
            p.showDatosPerson();

        }


    }
}
