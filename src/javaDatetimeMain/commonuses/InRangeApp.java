package javaDatetimeMain.commonuses;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.LocalTime;

import static java.time.ZoneOffset.UTC;

public class InRangeApp {

    public static void main(String[] args) {
        
        var start = LocalDate.of( 2020, 01, 01 ).atStartOfDay().atOffset( UTC );
        var end   = LocalDate.of( 2025, 12, 31 ).atTime( LocalTime.MAX ).atOffset( UTC );

        var now   = OffsetDateTime.now();

        System.out.println( start );
        System.out.println( end );

        System.out.println( inRange( now, start, end ) );

    }

    private static boolean inRange( OffsetDateTime now, OffsetDateTime start, OffsetDateTime end ) {       
        return now.isEqual( start ) || now.isEqual( end ) || now.isAfter( start ) || now.isBefore( end ) ;
    }
}
