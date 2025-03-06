package javaIOMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExSumFileLength {

    public static void main(String[] args) throws IOException {
        
        Path initialDir = Path.of( "" );
        System.out.println( initialDir.toAbsolutePath() );
        
        System.out.println( calculateSize( initialDir ) );
    }

    private static long calculateSize( Path initialDir ) throws IOException {

        long totalSize = 0;

        try ( var files = Files.newDirectoryStream( initialDir ) ) {

            for ( Path path : files ) {
                if ( Files.isDirectory( path ) ) {
                    totalSize += calculateSize( path );
                } else {
                    totalSize += Files.size( path );
                }
            }
        }
        return totalSize;
    }
}
