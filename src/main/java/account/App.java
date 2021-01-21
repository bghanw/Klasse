package account;

public class App {

    public static void main(String[] args) {

        Account savings = new Account();
        savings.deposit(200000);
        savings.withdraw(7800);

        System.out.println("the balance is  " + savings.getBalance());
        System.out.println("the Rate is  " + savings.getInterestRate());
        System.out.println("the interest is  " + savings.getInterest());

    }
}
