/******************************************************************************/
/* Autor...: Henrique Ferreira Polizer
/* Data....: 04-02-2025
/* Funcao..: app.java
/******************************************************************************/
public class App {

    public static void main( String[] args ) {

        int nDias = 0;
        int nMes = 0;
        var scanner = new java.util.Scanner( System.in );

        do {

            System.out.print( "Numero do mês: " );
            String nMesString = scanner.nextLine();

            if ( nMesString.isEmpty() ) {
                System.out.println( "Mês passado em branco!" );
                continue;
            }

            nMes = Integer.parseInt( nMesString );

            nDias = switch ( nMes ) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> {
                    System.out.println( "Mês digitado inválido!" );
                    yield 0;
                }
            };

        } while ( nMes < 1 || nMes > 12 );

        System.out.println( "O mês " + nMes + " tem " + nDias + " dias" );

        scanner.close();
    }

}
