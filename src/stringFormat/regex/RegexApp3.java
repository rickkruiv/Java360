package stringFormat.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp3 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w*\\s\\w*");
        Matcher m = p.matcher("abc def");

        System.out.println(m.matches());
        System.out.println("123".matches("\\d+"));
    }
}
