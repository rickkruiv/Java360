package java_exceptions_main.app;

import java_exceptions_main.account.Account3;
import java_exceptions_main.account.InsufficientFundsException;

public class App5 {

   public static void main(String[] args) {
      
      Account3 account = new Account3("1234");
      try { 
         account.deposit(1000);
         System.out.println(account);
      } catch( Exception e ) {
         System.out.println("Erro: não é possivel depositar valore negativos");
      }

      try {
         account.withdraw(-100);
      } catch (InsufficientFundsException | IllegalArgumentException e) {
         
         System.out.println( "ERRO: " + e.getMessage() );
         System.out.println( "StackTrace: " );
         // e.printStackTrace();
      }
      
   }
}
