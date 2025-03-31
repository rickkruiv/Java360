package javaIOMain;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
// import java.util.Scanner;

public class ExConsoleApp {

    public static void main(String[] args) throws IOException {
        
        Path pathOut = Path.of( "src/javaIOMain/files/example2" ).resolve( "console.txt" );
        
        try ( PrintWriter out = new PrintWriter( pathOut.toFile(), StandardCharsets.UTF_8 ) ) {

            while ( true ) {
                
                // Scanner in   = new Scanner( System.in );
                System.out.print( ">> " );
                // String line = in.nextLine();
    
                // if ( line.isEmpty() ) {
                //     break;
                // }
                // out.println( line );
            }
        }
    }
}
