public class CalculaMedia2 {
   
   public static void main( String[] args ) {

      var    scanner = new java.util.Scanner( System.in );
      double nNota, nSoma    = 0;
      int    nNotasDigitadas = 0;
    
      while ( true ) {

         System.out.print( "Informe uma nota: " );
         String cNotaString = scanner.nextLine(); 

         if ( cNotaString.isBlank() ) {
            if ( nNotasDigitadas == 0 ) {
               System.out.println("Nenhuma nota foi digitada. Não há média para calcular.");
               scanner.close();
               return;
            }
            break;
         }

         try {
            nNota = Double.parseDouble( cNotaString );
            nSoma += nNota;
            nNotasDigitadas ++;

         } catch ( NumberFormatException e ) {
            System.out.println( "Digite uma nota valida!" );
         }
      }

      double nMedia = nNotasDigitadas == 0 ? 0 : nSoma / nNotasDigitadas;
      System.out.println( "A média do aluno é: " + String.format( "%.1g", nMedia ) );

      scanner.close();
   }
}
