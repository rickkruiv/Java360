import java.util.Scanner;

public class Tabuada {
   
   public static void main( String[] args ) {
      
      Scanner scanner = new Scanner( System.in );

      System.out.print( "Digite um número: " );
      int nNumero = Integer.parseInt( scanner.nextLine() );

      for ( int i = 1; i <= 10; i++ ) {
         System.out.println( String.format( "%3d", i ) + " x " + nNumero + " = " + nNumero * i );
      }
      
      scanner.close();

   }

}
