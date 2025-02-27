package javaExceptionsMain.app;

import javaExceptionsMain.account.Account2;

public class App2 {

   public static void main(String[] args) {

      Account2 account2 = new Account2("1234");
      account2.deposit(500);
      System.out.println(account2);

      int rc = account2.withdraw(1000);
      if ( rc == 2 ) {
         System.out.println( "Saldo insuficiente!" );
      } else if ( rc == 3 ) {
         System.out.println("Não é possivel sacar valores negativos ou igual a zero");
      }
      System.out.println(account2);
   }
}
