package br.com.javainsider.app;

public class AppImparOuPar {
   
   public static void main( String[] args) {

      int    nValor;
      var    scanner      = new java.util.Scanner( System.in );
      String cValorString = "";
      String cParidade    = ""; 

      while ( true ) {
         System.out.print( "Informe um valor para verificação: " );
         cValorString = scanner.nextLine();

         try {
            nValor = Integer.parseInt( cValorString );
            break;
         } catch( NumberFormatException e ) {
            System.out.println( "\u001B[31mErro: Entrada inválida. Digite apenas números inteiros!\u001B[0m" );
         }
      }

      if ( nValor % 2 == 0 ) {
         cParidade = "par";
         nValor += 5;
      } else {
         cParidade = "impar";
         nValor += 2;
      }

      System.out.println( "O número digitado é " + cParidade );
      System.out.println( "O novo valor é " + nValor );
      scanner.close();

   }
}
