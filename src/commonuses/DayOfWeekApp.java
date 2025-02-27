package commonuses;

import java.time.DayOfWeek;

public class DayOfWeekApp {

    public static void main(String[] args) {
        
        DayOfWeek dayOfWeek1 = DayOfWeek.MONDAY;
        DayOfWeek dayOfWeek2 = DayOfWeek.TUESDAY;
        DayOfWeek dayOfWeek3 = DayOfWeek.of( 3 );
        DayOfWeek dayOfWeek4 = dayOfWeek1.plus( 3 );
        DayOfWeek dayOfWeek5 = DayOfWeek.of( 5 );

        System.out.println( dayOfWeek1.getValue() );
        System.out.println( dayOfWeek2.getValue() );
        System.out.println( dayOfWeek4 );

        System.out.println( dayOfWeek3 );
        System.out.println( dayOfWeek5 );

    }
}
