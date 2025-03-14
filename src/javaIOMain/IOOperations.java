package javaIOMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOOperations {

    public static void write( Writer out, String text ) throws IOException {
        out.write( text );
    }

    public static String read( Reader in ) throws IOException {

        int ascii = in.read();
        StringBuilder text = new StringBuilder();

        while ( ascii > -1 ) {
            text.append( (char) ascii );
            ascii = in.read();
        }
        return text.toString();
    }

    public static String read( BufferedReader in ) throws IOException {
        
        String line;
        StringBuilder text = new StringBuilder();

        while ( ( line = in.readLine() ) != null ) {
            text.append( line ).append( "\n" );
        }

        return text.toString();
    }

    public static byte[] read( InputStream input ) throws IOException {
        return input.readAllBytes();
    }

    public static void write( OutputStream output, byte[] bytes ) throws IOException {
        output.write( bytes );
    }

    public static void transfer( InputStream in, OutputStream out ) throws IOException {

        byte[] buffer = new byte[2048];

        while ( true ) {

            int byteRead = in.read( buffer );

            if ( byteRead < 0 ) { break; }

            out.write( buffer, 0, byteRead );
        }
    }
}
