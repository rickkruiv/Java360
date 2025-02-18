package java_exceptions_main.account;

public class Account3 {

   private final String number;
    private double balance;

    public Account3(String number) {
        this.number = number;
    }

    public void deposit(double amount) throws Exception {
        if ( amount < 0 ) {
            throw new Exception("\u001B[31mAmount cannot be negative\u001B[0m");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if ( amount < 0 ) {
            throw new RuntimeException( "\u001B[31mAmount cannot be negative\u001B[0m" );
        }

        if ( amount > balance ) { 
            throw new RuntimeException("\u001B[31mInsufficient funds\u001B[0m");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
