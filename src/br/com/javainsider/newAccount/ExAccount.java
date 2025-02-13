package br.com.javainsider.newAccount;

public class ExAccount {

   public static void main(String[] args) {
      
      CheckingAccount ckAccount = new CheckingAccount(100, 0.1);
      ckAccount.updateBalance();
      System.out.println(ckAccount.getBalance());

      SavingsAccount svAccount = new SavingsAccount(100);
      svAccount.updateBalance();
      System.out.println(svAccount.getBalance());
   }
}
