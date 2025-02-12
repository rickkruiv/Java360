package br.com.javainsider.app;

public class AppSomaPar {
   
   public static void main( String[] args ) {

      int soma = 0;
      int soma2 = 0;

      for ( int i = 0; i <= 100; i++ ) {
         soma += i % 2 == 0 ? i : 0;
      }

      for ( int j = 0; j <= 100; j += 2) {
         soma2 += j;
      }

      System.out.println( soma );
      System.out.println( soma2 );
   }

}
