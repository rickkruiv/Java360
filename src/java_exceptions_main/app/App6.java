package java_exceptions_main.app;

import java_exceptions_main.account.AccountService;

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
