package dateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeApp2 {

    public static void main(String[] args) {
        
        LocalTime time1 = LocalTime.now().withSecond( 0 ).withNano( 0 );
        LocalTime time2 = LocalTime.of( 10, 27 );

        LocalTime time3 = time1.minusMinutes( 10 );
        LocalTime time4 = time2.plusMinutes( 120 );

        String formatTime = time1.format( DateTimeFormatter.ofPattern( "HH'h' mm'min'" ) );

        System.out.println( "time1      ==> " + time1      );
        System.out.println( "time2      ==> " + time2      );
        System.out.println( "time3      ==> " + time3      );
        System.out.println( "time4      ==> " + time4      );
        System.out.println( "FormatTime ==> " + formatTime );
    }
}
