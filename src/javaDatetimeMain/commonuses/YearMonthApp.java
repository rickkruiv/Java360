package javaDatetimeMain.commonuses;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearMonthApp {

    public static void main(String[] args) {
        
        YearMonth yearMonth1 = YearMonth.of( 2010, 05 );
        YearMonth yearMonth2 = yearMonth1.withYear( 2012 );

        String formatedYM1 = yearMonth1.format( DateTimeFormatter.ofPattern( "MM/yyyy" ) );
        String formatedYM2 = yearMonth2.format( DateTimeFormatter.ofPattern( "yyyy/MM" ) );

        System.out.println( yearMonth1 );
        System.out.println( yearMonth2 );

        System.out.println( formatedYM1 );
        System.out.println( formatedYM2 );
    }
}
