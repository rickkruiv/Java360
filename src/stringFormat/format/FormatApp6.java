package stringFormat.format;

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class FormatApp6 {

        public static void main(String[] args) {

        System.out.println(Currency.getAvailableCurrencies());
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
    }
}
