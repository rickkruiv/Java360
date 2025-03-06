package javaIOMain;

import java.nio.file.Path;

public class PathApp1 {

    public static void main(String[] args) {
        
        Path path1 = Path.of( "C:", "System", "file.exe" );
        System.out.println( path1 );

        Path path2 = path1.getFileName();
        System.out.println( path2 );
        
        Path path3 = path1.getRoot();
        System.out.println( path3 );

    }
}
