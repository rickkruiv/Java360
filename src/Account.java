// Isso é um teste de versionamento. Aprendendo mais sobre git e github...
public class Account {
   String accountNumber;
   String accountOwner;
   double balance;

   void printAccountNumber() {
      System.out.println( "Número: " + accountNumber );
   }

   void printAccountOwner() {
      System.out.println( "Proprietário: " + accountOwner );
   }

   void printBalance() {
		System.out.println( "Saldo: R$" + String.format( "%.2f", balance ) );
	}
   
   void deposit( double amount ) {

      if ( amount <= 0 ) {
         System.out.println( "Não é possível adicionar quantias menor que R$0,01" );
         return;
      }

      balance += amount;
      System.out.println( "R$" + String.format( "%.2f", amount ) + " foram adicionados ao saldo: R$" + String.format( "%.2f", balance ) );
   }
   
   boolean withdraw( double amount ) { 
      if ( amount >= balance || amount <= 0 ) {
         return false;
      }
      balance -= amount;
      System.out.println( "R$" + String.format( "%.2f", amount ) + " foram retirados do saldo: R$" + String.format( "%.2f", balance ) );
      return true;
   }

   void trasnfer( double amount, Account targetAccount ) {
      withdraw( amount );
      targetAccount.deposit( amount );
      invoice( amount, targetAccount );
   }

   void invoice( double amount, Account targetAccount ) {
      System.out.println( "-- Dados da transferência ----------------------"                             );
      System.out.println( "Destinatário: "      + targetAccount.accountOwner                               );
      System.out.println( "Número da conta: "   + targetAccount.accountNumber                              );
      System.out.println( "Valor: R$" + String.format( "%.2f", amount )                             );
      System.out.println( "------------------------------------------------"                             );
      System.out.println( "Saldo na restante: R$" + String.format( "%.2f", balance ) );
   }

}
