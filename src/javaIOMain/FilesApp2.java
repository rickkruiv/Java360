package javaIOMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp2 {

    public static void main(String[] args) throws IOException {
        
        Path root = Path.of( "src/javaIOMain/files" );

        Path dir1 = root.resolve("example" );
        if ( !Files.exists( dir1 ) ) {
            Files.createDirectory( root.resolve( "example" ) );
        }

        Path dir3 = Files.createDirectories( dir1.resolve( Path.of( "ex_01", "ex_02" ) ) );

        System.out.println( dir3 );

        Files.createFile( dir3.resolve( "dir3.txt" ) );
        Files.createFile( dir1.getParent().resolve( "dir2.txt" ) );
        
        // Files.createFile( Path.of( "src/javaIOMain/files/example" ).resolve( "example1.txt" ) );
    }
}
