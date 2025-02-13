package br.com.javainsider.app;
import  br.com.javainsider.account2.*;

public class AppAccount2 {

   public static void main(String[] args) {
      Account accJoao = new Account("01");

      accJoao.setOwner("João Pedro");
      accJoao.setBalance(1000);
      accJoao.print();

      System.out.println("---------------------------");
      SavingsAccount accLuis = new SavingsAccount("02");

      accLuis.setOwner("Luis Matheus");
      accLuis.setRate(1.2);
      accLuis.setBalance(2000);
      accLuis.print();
      System.out.println(accLuis);

   }
}
