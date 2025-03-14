package javaIOMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class ExReadAndReplace {

    public static void main(String[] args) throws IOException {
        
        try ( 
            var in  = new BufferedReader( new FileReader( "src/javaIOMain/files/example1/data.in" ) );
            var out = new PrintWriter( Path.of( "src/javaIOMain/files/example1" ).resolve( "data.out" ).toFile() );
            ) {
                
                String line;

                while ( ( line = in.readLine() ) != null ) {
                    
                    line = line.replace( ".", ".\n" );
                    out.println( line.trim() );
                }
        }
    }
}
