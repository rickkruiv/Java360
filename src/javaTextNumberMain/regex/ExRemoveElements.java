package javaTextNumberMain.regex;

public class ExRemoveElements {

    public static void main(String[] args) {
        String text = "jf9pq38cmr9q832c51102svnkerfiiw";

        // N digitos 0-9
        System.out.println( text.replaceAll( "[0-9]", "" ) );
        System.out.println( text.replaceAll( "\\d"  , "" ) );

        // Só digitos
        System.out.println( text.replaceAll( "[^0-9]", "" ) );
        System.out.println( text.replaceAll( "\\D"   , "" ) );
    }
}
