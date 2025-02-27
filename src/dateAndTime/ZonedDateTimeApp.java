package dateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeApp {

    public static void main(String[] args) {
        
        LocalDateTime dateTime = LocalDateTime.now().withSecond(0).withNano(0);
        ZonedDateTime zonedDT1 = ZonedDateTime.of( dateTime, ZoneId.systemDefault() );
        ZonedDateTime zonedDT2 = ZonedDateTime.of( dateTime, ZoneId.of("Europe/Lisbon") );

        System.out.println( zonedDT1 );
        System.out.println( zonedDT2 );
    }
}
