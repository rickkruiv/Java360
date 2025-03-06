package javaIOMain;

import java.nio.file.Path;

public class PathApp2 {

    public static void main(String[] args) {
        
        Path path1 = Path.of( "/home" );
        Path path2 = Path.of( "ctosin" );
        Path path3 = Path.of( "log.out" );
        Path path4 = path1.resolve( path2 ).resolve( path3 );
        Path path5 = path4.toAbsolutePath();

        System.out.println( path4 );
        System.out.println( path5 );
    }
}
