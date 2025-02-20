package wrappers;

import java.util.Scanner;

public class ExNumber {

    public static void main(String[] args) {
        int number = perguntaNumero();

        System.out.println( "Binary.: " + Integer.toBinaryString( number ) );
        System.out.println( "Octal..: " + Integer.toOctalString( number ) );
        System.out.println( "Hex....: " + Integer.toHexString( number ) );
    }

    private static Integer perguntaNumero() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            
            try {
                System.out.print( "Numero.: " );
                int number = Integer.parseInt( scan.nextLine() );
                scan.close();
                return number;
            } catch( NumberFormatException e ) {}
        }
    }
}
