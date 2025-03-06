package javaIOMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExFileCreate {

    public static void main(String[] args) throws IOException {
        
        Path   directory = Path.of( "src/javaIOMain/files" );
        String fileName  = "file_" + System.currentTimeMillis() + ".txt";

        Files.createFile( directory.resolve( fileName ) );
    }
}
