package javaTextNumberMain.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp2 {

    public static void main(String[] args) {
        printMatches("fdklj3l20sxj280z1kj", "\\d([a-z])+");
    }

    private static void printMatches(String text, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.format("%d -> '%s'\n", m.start(), m.group());
        }
    }
}
