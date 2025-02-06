public class DayOfWeek {
   
   public static void main( String[] args ) {

      var    scanner = new java.util.Scanner( System.in );
      int    nDiaSemana = 0;
      String cDiaSemana, cDiaSemanaString;

      while ( true ) {
         System.out.print( "Digite um número ( 0 a 7 ): " );
         cDiaSemanaString = scanner.nextLine();

         try {
            nDiaSemana = Integer.parseInt( cDiaSemanaString );

            if ( nDiaSemana >= 1 && nDiaSemana <= 7 ) {
               break;
            } else {
               System.out.println( nDiaSemana + " não é um dia válido!" );
            }
         } catch ( NumberFormatException e ) {
            System.out.println( "Digite um número válido!" );
         }
      }

      cDiaSemana = switch( nDiaSemana ) { 
         case 1 -> "Domingo";
         case 2 -> "Segunda-Feira";
         case 3 -> "Terça-Feira";
         case 4 -> "Quarta-Feira";
         case 5 -> "Quinta-Feira";
         case 6 -> "Sexta-Feira";
         case 7 -> "Sábado";
         default -> "ERRO!";
      };

      System.out.println( "O dia da semana referente ao número " + nDiaSemana + " é " + cDiaSemana );

      scanner.close();
   }
}
