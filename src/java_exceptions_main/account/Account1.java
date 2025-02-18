package java_exceptions_main.account;

public class Account1 {

   private final String number;
    private double balance;

    public Account1(String number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    // NÃO FAÇA ISSO!!!
    public boolean withdraw(double amount) {
      if ( amount <= balance ) { 
         this.balance -= amount;
         return true;
      }
      return false;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
