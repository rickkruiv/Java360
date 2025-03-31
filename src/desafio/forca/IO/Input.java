package desafio.forca.IO;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static java.util.Objects.isNull;

public final class Input {

    private static final Scanner SCANNER = new Scanner( System.in );

    private Input() {}

    public static List<String> readLinesFromFile( String path) {

        URL url = Input.class.getResource( path );

        if ( url == null ) {
            throw new RuntimeException( "Nao encontrou o caminho: " + path );
        }

        try {
            return Files.readAllLines( Path.of( url.toURI() ), StandardCharsets.UTF_8 );
        } catch ( URISyntaxException | IOException e ) {
            throw new RuntimeException( "Erro ao carregar dicionario: " + e );
        }
    }

    public static String readFromKeyboard( String message ) {

        if( !isNull( message ) ) {
            Output.writeToConsole( message + ": ", false );
        }

        return SCANNER.nextLine().toUpperCase();
    }
}
