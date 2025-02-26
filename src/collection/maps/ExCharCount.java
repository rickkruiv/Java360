package collection.maps;

import java.util.Map;
import java.util.TreeMap;

public class ExCharCount {

    public static void main(String[] args) {

        System.out.println( count( "JAVA"           ) );
        System.out.println( count( "GARRAFA"        ) );
        System.out.println( count( "HENRIQUE"       ) );
        System.out.println( count( "TIGRINHO"       ) );
        System.out.println( count( "PARALELEPIPEDO" ) );

    }

    public static Map< Character, Integer > count( String str ) {

        char[] chars = str.toCharArray();
        Map< Character, Integer > map = new TreeMap<>();

        for (char caracter : chars) {
            int count = map.getOrDefault( caracter,0 );
            map.put( caracter, count + 1 );
        }

        return map;
    }
}
