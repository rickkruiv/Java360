public class AccountMain {
   
   public static void main( String[] args ) {

      Account account1       = new Account();
      account1.accountNumber = "1234-5";
      account1.accountOwner  = "Henrique";
      account1.balance       = 3000.00;

      Account account2       = new Account();
      account2.accountNumber = "5432-1";
      account2.accountOwner  = "Andressa";
      account2.balance       = 100.00;

      System.out.println( "**Conta 1*********************" );
      System.out.println( account1.accountNumber );
      System.out.println( account1.accountOwner  );
      System.out.println( account1.balance       );

      System.out.println( "**Conta 2*********************" );
      account2.printAccountNumber();
      account2.printAccountOwner();
      account2.deposit( 00.00 );
      account2.deposit( 30.00 );
      account2.withdraw( 20.00 );
      account2.printBalance();
      
      System.out.println( "******************************" );

   }
}
