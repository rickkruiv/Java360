package java_exceptions_main.sum;

import java.util.Scanner;

public class ExSum {

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);

      int valor1 = readValue( scan );      
      int valor2 = readValue( scan );

      System.out.println( "Soma: " + ( valor1 + valor2 ) );
      scan.close();
   }

   public static int readValue( Scanner scan) {
      
      System.out.print( "Digite um valor: " );
      try {
         return Integer.parseInt( scan.nextLine() );
      } catch( NumberFormatException e ) {
         System.out.println( "Valor inválido, assumindo valor como 10." );
         return 10;
      }
   }
}
