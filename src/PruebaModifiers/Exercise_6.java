package PruebaModifiers;

import AccessModifiers.User;

public class Exercise_6 {
    public static void main(String[] args) {
        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var user1 = new User("Fredy", "Fredy123");
        user1.checkPassword("Fredy123");

    }
}
