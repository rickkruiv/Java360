package dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateApp2 {

    public static void main(String[] args) {
        
        LocalDate date1 = LocalDate.of( 2003, 05, 23 );
        LocalDate date2 = date1.withYear( 2006 );
        LocalDate date3 = date2.plusDays( 100 );
        LocalDate date4 = date2.minusMonths( 9 );
        LocalDate date5 = date4.plus( 5, ChronoUnit.DAYS );

        String dataFormatada = date2.format( DateTimeFormatter.ofPattern( "dd/MM/yyyy" ) );

        System.out.println( "Data inicial   ==>  " +  date1         );
        System.out.println( "Meu nascimento ==>  " +  date2         );
        System.out.println( "Mais 100 dias  ==>  " +  date3         );
        System.out.println( "Menos 9 meses  ==>  " +  date4         );
        System.out.println( "Mais 5 dias    ==>  " +  date5         );
        System.out.println( "Meu nascimento ==>  " +  dataFormatada );
    }
}
