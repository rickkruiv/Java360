package br.com.javainsider.app;

public class AppCalculoDeMulta {
   
   public static void main( String[] args ){

      int    nPermitida, nConsiderada, nVelocidade = 0;
      var    scanner = new java.util.Scanner( System.in );
      double nMulta  = 0;

      System.out.print( "Velocidade permitida: " );
      nPermitida = Integer.parseInt( scanner.nextLine() );

      System.out.print( "Velocidade do veiculo: " );
      nVelocidade = Integer.parseInt( scanner.nextLine() );

      if ( nPermitida < 100 ) {
         nConsiderada = nVelocidade + 7;
      } else {
         nConsiderada = nVelocidade * 11 / 10;
      }

      if ( nVelocidade > nPermitida ) {
         System.out.println( "\u001B[31mVocê foi multado!\u001B[0m" );

         nMulta = ( nConsiderada - nPermitida ) * 10;
         System.out.println( "Valor da multa: " + nMulta );
      } else {
         System.out.println( "\u001B[32mVocê não foi multado!\u001B[0m" );
      }

      scanner.close();

   }

}
