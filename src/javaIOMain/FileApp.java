package javaIOMain;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

public class FileApp {

    public static void main(String[] args) {
        
        File file = new File( "." );

        System.out.println( "Caminho....: " + file.getAbsolutePath() );
        System.out.println( "É diretório? " + file.isDirectory()     );
        System.out.println( "É arquivo..? " + file.isFile()          );

        System.out.println( "Oque tem dentro? " + Arrays.toString( file.list() ) );
        
        Path path = file.toPath();
        System.out.println( "To path: " + path.toAbsolutePath() );
    }
}
