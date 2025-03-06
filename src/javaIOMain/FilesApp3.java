package javaIOMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FilesApp3 {

    public static void main(String[] args) throws IOException {
        
        String date = LocalDate.now().format( DateTimeFormatter.ofPattern( "dd_MM_yyy" ) );

        Path tempDir  = Files.createTempDirectory( Path.of( "src/javaIOMain/files" ), "App_" );
        Path tempFile = Files.createTempFile( tempDir, "App_" + date + "_", null );
        System.out.println( tempDir );
        System.out.println( tempFile);
    }
}
