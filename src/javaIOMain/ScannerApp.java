package javaIOMain;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) throws IOException {
        
        try ( Scanner scanner = new Scanner( Path.of( "src/javaIOMain/files/example2" ).resolve( "scanner.txt" ) ) ) {
            scanner.useDelimiter( "\\ | " );
            while ( scanner.hasNext() ) {
                String line = scanner.next();
                System.out.println( line );
            }
        }

    }
}
