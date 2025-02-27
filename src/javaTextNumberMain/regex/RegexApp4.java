package javaTextNumberMain.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp4 {

    public static void main(String[] args) {

        String text = "a3b5hj4j20f29p";
        String regex = "\\d";
        String replacement = "*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        StringBuilder sb = new StringBuilder();
        while(m.find()) {
            m.appendReplacement(sb, replacement);
        }
        m.appendTail(sb);

        System.out.println(sb);

        //----------------

        System.out.println(text.replaceAll(regex, replacement));
        System.out.println(text.replaceFirst(regex, replacement));
    }
}
