package Classess_test;

import Classess.Person;

public class classes {
    public static void main(String[] args) {

        var person  = new Person("Fredy", 26, "12345");
//
//        person.name = "Fredy";
//        person.age = 25;

        person.SayHello();

        var man = new Person("Dora", 49, "12345");
        man.SayHello();


    }
}


