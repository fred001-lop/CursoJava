package AccessModifiers;

public class BankAccount {
    //ATRIBUTOS
    private double balance;


    //constructor
    public BankAccount(double balance){
        if (balance >= 0){
            this.balance = balance;
        }else {
            this.balance = 0;
        }
    }

    //GEETTERS Y SETTERS
    public double getBalance() {
        return balance;
    }

    //metodo deposit
    public void deposit(double amount){
        if (amount >0){
            balance += amount;
            System.out.println("Deposito realizado!!");
            System.out.println("Su nuevo saldo es: " + balance);
        }else {
            System.out.println("El deposito debe ser mayor a 0");
        }
    }

    //metodo withdraw

    public void withDraw(double amount){
        if (amount > 0){
            balance -= amount;
            System.out.println("Retiro realizado!!");
            System.out.println("Su nuevo saldo es: " + balance);
        }else {
            System.out.println("Fondos insuficientes o cantidad invalida");
        }

    }

}
