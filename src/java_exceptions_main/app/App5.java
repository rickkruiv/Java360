package java_exceptions_main.app;

import java_exceptions_main.account.Account3;

public class App5 {

   public static void main(String[] args) {
      
      Account3 account = new Account3("1234");
      try { 
         account.deposit(1000);
         System.out.println(account);
      } catch( Exception e ) {
         System.out.println("Erro: não é possivel depositar valore negativos");
      }
   }
}
