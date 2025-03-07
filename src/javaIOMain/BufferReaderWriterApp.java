package javaIOMain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class BufferReaderWriterApp {

    public static void main(String[] args) throws IOException {
        
        try ( Writer out = new BufferedWriter( new FileWriter( "src/javaIOMain/files/file_1741291959095.txt", StandardCharsets.UTF_8 ) ) ) {
            IOOperations.write( out, "Qualquer coisa aqui" );
            out.flush();
        }
        
        try ( BufferedReader in = new BufferedReader( new FileReader( "src/javaIOMain/files/file_1741291959095.txt", StandardCharsets.UTF_8 ) ) ) {
            System.out.println( IOOperations.read( in ) );
        }
    }
}
