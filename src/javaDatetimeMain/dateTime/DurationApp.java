package javaDatetimeMain.dateTime;

import java.time.Duration;

public class DurationApp {

    public static void main(String[] args) {
        
        Duration duration1 = Duration.ofHours( 3 );
        Duration duration2 = Duration.ofMinutes( 60*3 );
        Duration duration3 = Duration.ofSeconds( 3*3600 );

        System.out.println( duration1 );
        System.out.println( duration2 );
        System.out.println( duration3 );

        System.out.println( duration1.toSeconds() );
        System.out.println( duration2.toMinutes() );
        System.out.println( duration3.toMinutes() );
    }
}
