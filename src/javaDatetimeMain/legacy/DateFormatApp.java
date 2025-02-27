package javaDatetimeMain.legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatApp {

    public static void main(String[] args) throws Exception {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set( 2006, 05, 23, 0, 0, 0 );

        System.out.println( calendar );

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd/MM/mm - HH:mm:ss" );
        String dateFormat = simpleDateFormat.format( calendar.getTime() );

        System.out.println( dateFormat );

        Date parseDate = simpleDateFormat.parse( "23/06/00 - 00:00:00" );
        System.out.println( parseDate );

    }
}
