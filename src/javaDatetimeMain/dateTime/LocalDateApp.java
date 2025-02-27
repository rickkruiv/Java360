package javaDatetimeMain.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateApp {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of( 2006, 05, 23 );
        System.out.println( date );

        LocalDate date2 = LocalDate.parse( "2006-05-23" );
        System.out.println( date2 );

        LocalDate date3 = LocalDate.parse( "23/05/2006", DateTimeFormatter.ofPattern( "dd/MM/yyyy" ) );

        System.out.println( date3 );
        
    }
}
