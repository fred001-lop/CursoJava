package InheritanceExercises.ficheros;

public class Account {

    private double balance;

    //constructor
    public Account(double balance){
        if (balance >= 0){
            this.balance = balance;
        }else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    //METODOS

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposito realizado");

        }else {
            System.out.println("El deposito debe ser mayor a 0");
        }
    }

    public void withDraw(double amount){

        if (amount > 0){
            balance -= amount;
            System.out.println("Retiro realizado");
        }else {
            System.out.println("La cantidad debe ser mayor a 0");
        }


    }


}
