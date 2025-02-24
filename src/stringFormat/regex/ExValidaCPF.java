package stringFormat.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExValidaCPF {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner( System.in );
        
        System.out.print( "CPF: " );
        String cpf = scan.nextLine();

        if ( validaCPF( cpf ) ) {
            System.out.println( "CPF VALIDO" );
        } else {
            System.out.println( "CEP INVALIDO" );
        }

        scan.close();
    }

    public static boolean validaCPF( String cpf ) {

        Pattern pattern = Pattern.compile( "^\\d{3}[.\\s]?\\d{3}[.\\s]?\\d{3}[.\\s]?[-\\s]?\\d{2}$" );
        Matcher matcher = pattern.matcher( cpf );

        return matcher.find();
    }
}
