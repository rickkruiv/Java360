package javaExceptionsMain.app;

import javaExceptionsMain.account.AccountService;

public class App6 {

   public static void main(String[] args) {
      
      AccountService accountService = new AccountService();

      try {
         accountService.createAndWithdraw("1234", 1200);
      } catch (Exception e) {
          e.printStackTrace();
      }
   }
}
