package javaIOMain;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriterApp1 {

    public static void main(String[] args) throws IOException {
        
        try ( FileWriter out = new FileWriter( "src/javaIOMain/files/file_1741291959095.txt", StandardCharsets.UTF_8 ) ) {
            out.write( "Henrique Polizer" );
        }
        
        try ( FileReader in = new FileReader( "src/javaIOMain/files/file_1741291959095.txt", StandardCharsets.UTF_8 ) ) {

            int ascii = in.read();
            StringBuilder text = new StringBuilder();

            while ( ascii > -1 ) {
                text.append( (char) ascii );
                ascii = in.read();
            }
            System.out.println( text );
        }
    }
}
