package java_exceptions_main.account;

public class AccountService {

   public void createAndWithdraw( String accountNumber, double amount ) throws ServiceException {

      Account3 account = new Account3(accountNumber);
      account.deposit(1000);

      try {
          account.withdraw(amount);
      } catch (Exception e) {
         throw new ServiceException("Error during withdraw", e);
      }
   }
}
