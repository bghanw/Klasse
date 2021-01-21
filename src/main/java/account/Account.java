package account;

public class Account {

    private static String accountname;
    private static String accountnumber;
    private static String accounttype;

    public Account(String accountname, String accountnumber, String accounttype){

        /*
        Account.accountname=accountname;
        Account.accountnumber=accountnumber;
        Account.accounttype=accounttype;    */

        // a better control of constructor is as follow

        Account.setAccountname(accountname);
        Account.setAccountnumber(accountnumber);
        Account.setAccounttype(accounttype);

    }

    public static String getAccountname(){
        return accountname;
    }
    public static void setAccountname(String accountname){
        Account.accountname = accountname;
    }

    public static String getAccountnumber(){
        return accountnumber;
    }
    public static void setAccountnumber(String accountnumber){
        Account.accountnumber = accountnumber;
    }

    public static void setAccounttype(String accounttype){
        if (accounttype.equals("Saving") || accounttype.equals("Current")) {
            Account.accounttype = accounttype;
        }else {
            Account.accounttype = "Not Specified";
        }

    }
    public static String getAccounttype(){
        return accounttype;
    }

    private static double balance = 0;                         // Saldo
    private static double interestRate = 0.01;                 // Zinssatz
    public static final String currency = "CHF";              // Wöhrung
    private static double interest =0;                        // Zinst


    public static double getBalance()
    {
        return balance;
    }

    public static double getInterestRate()
    {
        return interestRate;
    }

    public static double getInterest()
    {
        return interest  = balance *  interestRate;
    }

    public static void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
        else
        {
         throw new IllegalArgumentException("The amount hast to be greater than 0");
        }
    }

    public static void withdraw(double amount)
    {
        balance -= amount;
    }

    public static void setInterestRate(double interestRate)
    {
        Account.interestRate =interestRate;
    }
}
