package java_exceptions_main.account;

public class Account2 {

   private final String number;
    private double balance;

    public Account2(String number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    // TAMBÉM NÃO FAÇA ISSO!!!
    public int withdraw(double amount) {
        if ( amount <= 0 ) {
            return 3;
        }

        if ( amount <= balance ) { 
            this.balance -= amount;
            return 1;
        }
        return 2;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
