package javaDatetimeMain.legacy;

import java.time.Instant;
import java.time.LocalDateTime;

import static java.time.ZoneOffset.UTC;

import java.util.Date;

public class DateAndInstantApp {

    public static void main(String[] args) {
        
        Instant instant = LocalDateTime.of( 2006, 05, 23, 12, 0, 0, 0 ).toInstant( UTC );
        System.out.println( instant );

        Date date = Date.from( instant );
        System.out.println( date );

        Instant instant2 = date.toInstant();
        System.out.println( instant2 );

        Date date2 = Date.from( instant2 );
        System.out.println( date2 );
    }
}
