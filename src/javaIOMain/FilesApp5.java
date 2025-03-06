package javaIOMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesApp5 {

    public static void main(String[] args) throws IOException {
        
        // Files.createDirectory( Path.of( "src/javaIOMain/files" ).resolve( "example2" ) );
        // Files.createFile( from.resolve( "example_1.txt" ) );

        Path from = Path.of( "src/javaIOMain/files/example1", "example_1.txt" );
        Path to   = from.getParent().resolve( "example_1_copy.txt" );
        Path to2  = Path.of( "src/javaIOMain/files/example2" ).resolve( "example_1_copy.txt" );

        Files.copy( from, to, StandardCopyOption.REPLACE_EXISTING );
        
        Files.move( to2, from, StandardCopyOption.REPLACE_EXISTING );
        
        Files.copy( from, to2, StandardCopyOption.REPLACE_EXISTING );
    }
}
