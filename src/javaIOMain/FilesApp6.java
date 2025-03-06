package javaIOMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp6 {

    public static void main(String[] args) throws IOException {
        
        try ( var files = Files.newDirectoryStream( Path.of( "" ), "*.md" ) ) {
            
            for ( Path path : files ) {
                
                System.out.format( "%-20s => %-10s \n", path, Files.isDirectory( path ) ? "pasta" : "arquivo" );
            }
        }
    }
}
