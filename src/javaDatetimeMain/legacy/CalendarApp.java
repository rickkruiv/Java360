package javaDatetimeMain.legacy;

import java.util.Calendar;

public class CalendarApp {

    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        calendario.set( 2006, Calendar.MAY, 23, 12, 00, 00 );

        calendario.add( Calendar.YEAR, 19 );

        System.out.println( calendario.getTime() );
    }
}
