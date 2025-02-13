package br.com.javainsider.newAccount;

public class CheckingAccount extends Account {

   private double rate;

   public CheckingAccount(double balance, double rate) {
      super(balance);
      this.rate = rate;
   }
   
   @Override
   double rate() {
      return rate;
   }
}
