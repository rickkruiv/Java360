package javaExceptionsMain.app;

import javaExceptionsMain.account.Account1;

public class App1 {

   public static void main(String[] args) {

      Account1 account1 = new Account1("1234");
      account1.deposit(500);
      System.out.println(account1);
      if ( !account1.withdraw(1000) ) {
         System.out.println( "Saldo insuficiente!" );
      };
      System.out.println(account1);
   }   
}
