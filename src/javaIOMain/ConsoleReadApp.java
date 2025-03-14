package javaIOMain;

// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReadApp {

    public static void main(String[] args) throws IOException {
        
        // try ( var reader = new BufferedReader( new InputStreamReader( System.in )) ) {

        //     String line = reader.readLine();
        //     System.out.println( new StringBuilder( line ).reverse() );
        // }

        try ( var scanner = new Scanner( System.in ) ) {
            String line = scanner.nextLine();
            System.out.println( new StringBuilder( line ).reverse() );
        } 

    }
}
