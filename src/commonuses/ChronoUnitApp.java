package commonuses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitApp {

    public static void main(String[] args) {
        
        var start = LocalDate.of( 2000, 01, 01 );
        var end   = LocalDate.of( 2000, 12, 31 );

        System.out.println( ChronoUnit.DAYS.between( start, end ) );
        System.out.println( ChronoUnit.MONTHS.between( start, end ) );
        System.out.println( ChronoUnit.YEARS.between( start, end ) );

        var newTime = ChronoUnit.HOURS.addTo( LocalTime.of( 12, 00, 00 ), 3 );

        System.out.println( newTime );
    }
}
