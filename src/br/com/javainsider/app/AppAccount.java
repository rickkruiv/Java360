package br.com.javainsider.app;

import br.com.javainsider.account.IdGeneratedAccount;

public class AppAccount {

   public static void main(String[] args) {
      
      IdGeneratedAccount idGeneratedAccount = new IdGeneratedAccount("011");
      idGeneratedAccount.printBalance();
      System.out.println(IdGeneratedAccount.getCurrentId());
   }

}
