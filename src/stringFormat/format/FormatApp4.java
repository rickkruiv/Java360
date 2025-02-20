package stringFormat.format;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp4 {

    public static void main(String[] args) {

        double num = 3456.21;

        Locale locale = Locale.forLanguageTag( "pt-br" );
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String formatted = numberFormat.format(num);

        //System.out.println(formatted);
        PrintWriter out = new PrintWriter(System.out, true, StandardCharsets.UTF_8);
        out.println(formatted);
    }
}
