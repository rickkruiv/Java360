package br.com.javainsider.app;

import br.com.javainsider.account.IdGeneratedAccount;

public class App07 {

   public static void main(String[] args) {
      
      IdGeneratedAccount idGenAccount1 = new IdGeneratedAccount("Henrique");
      System.out.println(idGenAccount1.getAccountNumber());
      
      IdGeneratedAccount idGenAccount2 = new IdGeneratedAccount("Henrique");
      System.out.println(idGenAccount2.getAccountNumber());
      
      IdGeneratedAccount idGenAccount3 = new IdGeneratedAccount("Henrique");
      System.out.println(idGenAccount3.getAccountNumber());
      
      IdGeneratedAccount idGenAccount4 = new IdGeneratedAccount("Henrique");
      System.out.println(idGenAccount4.getAccountNumber());

      System.out.println(IdGeneratedAccount.getCurrentId());

   }
}

