package InheritanceExercises.ficheros;



public class SavingsAccount extends Account{

    private double inters;

    public SavingsAccount(double balance, double inters) {
        super(balance);
        this.inters = inters;

    }

    //
    public void addInterest(){
        double interestAmount = getBalance() * inters;
        deposit(interestAmount);
        System.out.println("Interes agregado" + interestAmount);
    }

    public double getBalance(){
        return super.getBalance();
    }


}
