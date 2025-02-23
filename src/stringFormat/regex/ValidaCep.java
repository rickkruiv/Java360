package stringFormat.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaCep {

    public static void main(String[] args) {
        
        String[] ceps = { "87055 560", "87055-560", "12345-678", "1234-5678", "1234-5678" };

        for ( String cep : ceps ) {
            
            if ( cepValido( cep ) ) {
                System.out.printf( "\u001B[32m%9s\u001B[0m é um cep válido\n", cep );
            } else {
                System.out.printf( "\u001B[31m%9s\u001B[0m é um cep inválido\n", cep );
            }
        }
    }

    public static boolean cepValido( String cep ) {

        Pattern pattern = Pattern.compile( "^\\d{5}([\\s-])?\\d{3}$" );
        Matcher matcher = pattern.matcher(cep);

        return matcher.find();
    }
}
