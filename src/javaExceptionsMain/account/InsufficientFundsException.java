package javaExceptionsMain.account;

public class InsufficientFundsException extends Exception {

   private final double currentBalance;

   public InsufficientFundsException(double currentBalance) {
      
      super("There is no sufficient fund to withdraw");
      this.currentBalance = currentBalance;
   }

   public double getCurrentBalance() {
      return currentBalance;
   }
}
