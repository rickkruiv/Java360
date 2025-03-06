package javaIOMain;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp1 {

    public static void main(String[] args) {
        
        Path fileTeste1 = Path.of( "src/javaIOMain/files/teste1.txt" );

        System.out.println( fileTeste1.toAbsolutePath() );
        System.out.println( Files.exists( fileTeste1 ) );
        System.out.println( Files.isDirectory( fileTeste1 ) );   // pasta?
        System.out.println( Files.isRegularFile( fileTeste1 ) ); // arquivo?
    }
}
