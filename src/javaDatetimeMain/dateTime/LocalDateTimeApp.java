package javaDatetimeMain.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApp {

    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now().withSecond(0).withNano(0);

        LocalDateTime dateTime1 = LocalDateTime.of( date, time );
        LocalDateTime dateTime2 = LocalDateTime.now().withSecond(0).withNano(0);
        LocalDateTime dateTime3 = date.atTime( time );
        LocalDateTime dateTime4 = time.atDate( date );

        LocalDateTime dateTime5 = dateTime1.plusWeeks( 1 );

        String formatDateTime = dateTime1.format( DateTimeFormatter.ofPattern( "dd/MM/yyyy - HH'h'mm'min'ss's'" ) );

        System.out.println( "dateTime1.....: ==> " + dateTime1 );
        System.out.println( "dateTime2.....: ==> " + dateTime2 );
        System.out.println( "dateTime3.....: ==> " + dateTime3 );
        System.out.println( "dateTime4.....: ==> " + dateTime4 );
        System.out.println( "dateTime5.....: ==> " + dateTime5 );
        System.err.println( "formatDateTime: ==> " + formatDateTime );

    }
}
