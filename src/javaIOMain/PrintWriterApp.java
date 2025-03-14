package javaIOMain;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintWriterApp {

    public static void main(String[] args) throws IOException {
        
        PrintWriter out = new PrintWriter( "src/javaIOMain/files/example2/out.txt", StandardCharsets.UTF_8 );

        out.println( "Algum texto" );
        out.format( "%-20s\t%20s\n", "90000", "2323" );
        out.format( "%-20s\t%20s\n", "90001", "2324" );
        out.format( "%-20s\t%20s\n", "90002", "2325" );
        out.format( "%-20s\t%20s\n", "90003", "2326" );
        out.format( "%-20s\t%20s\n", "90004", "2327" );
        out.format( "%-20s\t%20s\n", "90005", "2328" );
        out.format( "%-20s\t%20s\n", "90006", "2329" );
        out.format( "%-20s\t%20s\n", "90007", "2330" );
        out.format( "%-20s\t%20s\n", "90008", "2331" );
        out.format( "%-20s\t%20s\n", "90009", "2332" );
        out.format( "%-20s\t%20s\n", "90010", "2333" );
        out.format( "%-20s\t%20s\n", "90011", "2334" );

        out.close();
    }
}
