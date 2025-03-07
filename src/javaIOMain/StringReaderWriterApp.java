package javaIOMain;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class StringReaderWriterApp {

    public static void main(String[] args) throws IOException {
        
        try ( Writer out = new StringWriter() ) {
            IOOperations.write( out, "Qualquer coisa aqui" );
            System.out.println( out );
        }
        
        try ( Reader in = new StringReader( "Uma String qualquer" ) ) {
            System.out.println( IOOperations.read( in ) );
        }
    }
}
