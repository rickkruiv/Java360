package javaDatetimeMain.dateTime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffSetTimeApp {

    public static void main(String[] args) {
        
        LocalDateTime  dateTime = LocalDateTime.of( 2006, 05, 23, 3, 3, 3 ); 
        OffsetDateTime odt1     = OffsetDateTime.of( dateTime, ZoneOffset.UTC );
        OffsetDateTime odt2     = odt1.withOffsetSameInstant( ZoneOffset.of( "-03:00" ) );

        System.out.println( odt1 );
        System.out.println( odt2 );
    }
}
