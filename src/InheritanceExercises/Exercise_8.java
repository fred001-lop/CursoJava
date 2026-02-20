package InheritanceExercises;

import InheritanceExercises.ficheros.SavingsAccount;

public class Exercise_8 {
    public static void main(String[] args) {
        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().

        SavingsAccount cuenta = new SavingsAccount(1000, 0.5);
        cuenta.deposit(500);
        cuenta.withDraw(200);
        cuenta.addInterest();
        System.out.println("Balance final:" + cuenta.getBalance());

    }
}
