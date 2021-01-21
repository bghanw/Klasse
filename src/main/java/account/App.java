package account;

public class App {

    public static void main(String[] args) {


        Account customer = new Account
                ("Aldabei","0025648797852", "savings");

        customer.setAccounttype("Current");


        customer.deposit(300000);
        customer.withdraw(70000);

        System.out.println("A/c holder " +Account.getAccountname());
        System.out.println("A/c number " +Account.getAccountnumber());
        System.out.println("A/c type " +Account.getAccounttype());
        System.out.println("current balance:  " + customer.getBalance());
        System.out.println("Interest Rate:  " + customer.getInterestRate());
        System.out.println("Interest:  " + customer.getInterest());
        customer.setInterestRate(0.05);
        System.out.println("Next Year Interest Rate: " +customer.getInterestRate()+
                " Estimated Interest for next Year: " +customer.getInterest());

    }
}
