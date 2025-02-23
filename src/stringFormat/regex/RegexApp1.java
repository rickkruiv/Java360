package stringFormat.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp1 {

    public static void main(String[] args) {

        String text = "349qgh4nvseoinv029482t4qdfanjoaiwefj-328g";
        String regex = "\\d";

        printMatches( text, regex );
    }

    public static void printMatches( String text, String regex ) {
        
        Pattern pattern = Pattern.compile( regex );
        Matcher matcher = pattern.matcher( text );

        while ( matcher.find() ) {
            System.out.printf( "%d -> '%s'\n", matcher.start(), matcher.group() );
        }
    } 
}
