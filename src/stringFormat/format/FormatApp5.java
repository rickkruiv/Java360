package stringFormat.format;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.Currency;

public class FormatApp5 {

    public static void main(String[] args) {

        double n = 3879456.21;

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        nf.setGroupingUsed(false);
        nf.setMinimumFractionDigits(4);
        nf.setMaximumFractionDigits(4);
        nf.setCurrency(Currency.getInstance("EUR"));

        new PrintWriter(System.out, true, StandardCharsets.UTF_8).println(nf.format(n));
    }
}
