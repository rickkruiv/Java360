package javaIOMain;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamApp {

    public static void main(String[] args) throws IOException {
        
        try (
            FileInputStream  input  = new FileInputStream( "src/javaIOMain/files/file_1741291959095.txt" );
            FileOutputStream output = new FileOutputStream( "src/javaIOMain/files/ex2.txt" );
        ) {
            byte[] bytes = IOOperations.read( input );
            IOOperations.write( output, bytes );
        }
    }
}
