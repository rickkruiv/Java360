public class EncapsulatedAccountMain {
   
   public static void main( String[] args ) {

      EncapsulatedAccount encapsulated = new EncapsulatedAccount();

      // encapsulated.deposit(1000);
      // encapsulated.balance = 100; // isso não é bom
      
      encapsulated.setBalance(10);
      encapsulated.printBalance();
      System.out.println(encapsulated.getBalance());

   }
}
