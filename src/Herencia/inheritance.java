package Herencia;

public class inheritance {
    public static void main(String[] args) {

        var animal = new animal();
        animal.name = "Mi animal";
        animal.eat();

        var dog = new dog();
        dog.name = "Canelo";
        dog.eat();
        var gato = new cat();
        gato.name = "Mimi";
        gato.eat();
    }
    public static class  animal{
        String name;

        public void eat(){
            System.out.println("EL animal con nombre " + name +" esta comiendo");
        }
    }
    public static class dog extends animal{


    }
    public static class cat extends animal{


    }
}
