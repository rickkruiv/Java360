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
   
   void withdraw( double amount ) { 
      if ( amount >= balance ) {
         System.out.println( "Não é possivel retirar quantia. Motivo: sem saldo suficiente.");
         return;
      }
      balance -= amount;
      System.out.println( "R$" + String.format( "%.2f", amount ) + " foram retirados do saldo: R$" + String.format( "%.2f", balance ) );
   }
}
