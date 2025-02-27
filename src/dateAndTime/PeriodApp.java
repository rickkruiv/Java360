package dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodApp {

    public static void main(String[] args) {
        
        Period period1 = Period.ofYears( 1 );
        Period period2 = Period.between( LocalDate.of( 2006, 05, 23), LocalDate.now() );

        System.out.println( period1 );
        System.out.println( period2 );
    }
}
