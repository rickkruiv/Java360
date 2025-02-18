package java_exceptions_main.account;

public class Account3 {

    private final String number;
    private double balance;

    public Account3(String number) {
        this.number = number;
    }

    public void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("\u001B[31mAmount cannot be negative\u001B[0m");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("\u001B[31mAmount cannot be negative\u001B[0m");
        }

        if (balance - amount < 0) {
            throw new InsufficientFundsException(balance);
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
