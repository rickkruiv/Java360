package dateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExDaysSinceBirth {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner( System.in );
        System.out.print( "Nascimento: " );
        period( scan.nextLine() );
        scan.close();
    }

    public static void period( String date ) {

        LocalDate localDate = LocalDate.parse( date.replaceAll( "[-/.]", ""), DateTimeFormatter.ofPattern( "ddMMyyyy" ) );
        Period    periodo   = Period.between( localDate, LocalDate.now() );

        System.out.printf( "Você tem: %d anos, %s mese e %d dias",periodo.getYears(), periodo.getMonths(), periodo.getDays() );
    }
}
