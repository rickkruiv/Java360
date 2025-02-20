package strings.app;

import java.util.Scanner;

public class ExReverse {

   public static void main( String[] args ) {

      Scanner scan = new Scanner(System.in);

      String text = readText(scan);
      textReverese( text );

      scan.close();
   }

   public static String readText( Scanner scan ) {

      System.out.print( "Frase: " );
      return scan.nextLine();
   }

   public static void textReverese( String text ) {

      System.out.println( new StringBuilder(text).reverse() );  
   }
}
