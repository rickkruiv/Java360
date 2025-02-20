package stringFormat.format;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp3 {

    public static void main(String[] args) {

        double num = 3456.21;

        Locale locale = Locale.forLanguageTag( "pt-br" );
        NumberFormat numFormat = NumberFormat.getInstance(locale);
        String formatted = numFormat.format(num);

        System.out.println(formatted);
    }
}
