package javaIOMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp4 {

    public static void main(String[] args) throws IOException {
        
        Path file = Path.of( "src/javaIOMain/files/example" );
        
        // Files.createFile( file.resolve( "example1.txt" ) );
        Files.deleteIfExists( file.resolve( "example1.txt" ) );
        System.out.println( file );
    }
}
