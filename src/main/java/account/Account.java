package account;

public class Account {

    private double balance = 0;                         // Saldo
    private double interestRate = 0.01;                 // Zinssatz
    public final String currency = "CHF";              // Wöhrung
    private double interest =0;                        // Zinst


    public double getBalance(){
        return balance;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public double getInterest(){
        return interest  = balance *  interestRate;
    }

    public void deposit(double amount){
        if (amount > 0)
        {
            balance += amount;
        }
        else
        {
         throw new IllegalArgumentException("The amount hast to be greater than 0");
        }
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void setInterestRate(double interestRate){
        this.interestRate =interestRate;
    }
}
