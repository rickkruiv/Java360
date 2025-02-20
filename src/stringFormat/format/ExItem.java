package stringFormat.format;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class ExItem {

    public static void main(String[] args) {

        Item item1 = new Item( "Item #1", 240.2, "EUR" );
        Item item2 = new Item( "Item #2", 9.17 , "USD" );
        Item item3 = new Item( "Item #3", 1731 , "BRL" );

        PrintWriter out = new PrintWriter( System.out, true, StandardCharsets.UTF_8 );
        out.println( item1 );
        out.println( item2 );
        out.println( item3 );
    }
}
