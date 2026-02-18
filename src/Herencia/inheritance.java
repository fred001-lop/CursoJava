package Herencia;

public class inheritance {
    public static void main(String[] args) {

        var animal = new animal("Mi animal");
//        animal.name = "Mi animal";
        animal.eat();

        var dog = new dog("Canelo", 5);
//        dog.name = "Canelo";
        dog.eat();
        var gato = new cat("Mimi");
//        gato.name = "Mimi";
        gato.eat();

        var bird = new Bird("Cotorra");
//        bird.name = "Cotorra";
        bird.eat();
        bird.fly();



    }
    public static class  animal{
        String name;
        //constructor
        public animal(String name){
            this.name = name;
        }
        public void eat(){
            System.out.println("EL animal con nombre " + name +" esta comiendo");
        }
    }
    public static class dog extends animal{

        int age;


        public dog(String name, int age) {
            super(name);
            this.age = age;

        }

        @Override
        public void eat(){
            System.out.println("EL perro con nombre " + name +" esta comiendo");
        }


    }
    public static class cat extends animal{


        public cat(String name) {
            super(name);
        }
    }

    public static class Bird extends animal{
        public Bird(String name) {
            super(name);
        }

        public void fly(){
            System.out.println("Esta volando");
        }
    }

}
