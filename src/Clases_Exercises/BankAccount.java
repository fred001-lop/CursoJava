package Clases_Exercises;

public class BankAccount {
    //ATRIBUTOS

    int balance;


    //CONSTRUCTOR

    public BankAccount(int balance){
        this.balance = balance;

    }

    //METODO
    public void deposit(int amount){


        balance += amount;
        System.out.println("EL saldo de la cuenta es: " + balance);



    }





}
