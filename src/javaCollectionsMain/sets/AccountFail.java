package javaCollectionsMain.sets;

import java.util.Objects;

public class AccountFail {

    private final String number;
    private final double balance;

    public AccountFail(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountFail account = (AccountFail) o;
        return Double.compare(account.balance, balance) == 0 && Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 1000);
    }

    @Override
    public String toString() {
        return "Account{" +
            "number='" + number + '\'' +
            ", balance=" + balance +
            '}';
    }
}
