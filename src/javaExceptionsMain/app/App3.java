package javaExceptionsMain.app;

import javaExceptionsMain.account.Account3;

public class App3 {

   public static void main(String[] args) throws Exception {

      Account3 account3 = new Account3("1234");
      account3.deposit(1000);
      System.out.println(account3);

      account3.withdraw(1100);

      System.out.println(account3);
   }
}
