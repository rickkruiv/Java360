package javaDatetimeMain.dateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeApp {

    public static void main(String[] args) {
        
        LocalTime time  = LocalTime.now();
        LocalTime time2 = time.withSecond( 0 ).withNano( 0 );
        LocalTime time3 = LocalTime.parse( "00:00:00" );
        LocalTime time4 = LocalTime.parse( "10-20-30", DateTimeFormatter.ofPattern( "HH-mm-ss" ) );
        LocalTime time5 = LocalTime.of( 3, 3, 3 );
        

        System.out.println( time  );
        System.out.println( time2 );
        System.out.println( time3 );
        System.out.println( time4 );
        System.out.println( time5 );        
    }
}
