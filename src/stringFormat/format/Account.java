package stringFormat.format;

public class Account {
    private final String number;
    private final String name;
    private final double balance;

    public Account(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        //return number + " " + name + " " + balance;

        return String.format("%-15s \t\t %-35s \t %.2f", number, name, balance);
    }
}
