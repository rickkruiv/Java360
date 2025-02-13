package br.com.javainsider.account2;

public class Account {

   private   String owner;
   private   String number;
   protected double balance;

   public Account(String number) {
      this.number = number;
   }

   public String getOwner() {
      return owner;
   }

   public void setOwner(String owner) {
      this.owner = owner;
   }

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public void print() {
      System.out.println("Owner..: " + owner  );
      System.out.println("Number.: " + number );
      System.out.println("Balance: " + balance);
   }

}
