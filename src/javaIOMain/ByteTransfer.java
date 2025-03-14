package javaIOMain;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ByteTransfer {

    public static void main(String[] args) throws IOException {

        try (    
            InputStream  input  = new ByteArrayInputStream( "Texto bacana".getBytes( StandardCharsets.UTF_8 ) );
            OutputStream output = new FileOutputStream( "src/javaIOMain/files/ex2.txt" );
        ) {
            IOOperations.transfer( input, output );
        }
    }
}
