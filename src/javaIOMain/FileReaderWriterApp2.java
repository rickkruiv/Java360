package javaIOMain;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriterApp2 {

    public static void main(String[] args) throws IOException {
        
        try ( FileWriter out = new FileWriter( "src/javaIOMain/files/file_1741291959095.txt", StandardCharsets.UTF_8 ) ) {
            IOOperations.write( out, "Qualquer coisa aqui" );
        }
        
        try ( FileReader in = new FileReader( "src/javaIOMain/files/file_1741291959095.txt", StandardCharsets.UTF_8 ) ) {
            System.out.println( IOOperations.read( in ) );
        }
    }
}
