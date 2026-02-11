package PruebaModifiers;

import AccessModifiers.BankAccount;

public class Exercise_3 {
    public static void main(String[] args) {
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var depositar = new BankAccount(400);
        depositar.deposit(400);
        depositar.withDraw(0);
    }
}
