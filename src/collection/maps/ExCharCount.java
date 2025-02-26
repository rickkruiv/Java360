package collection.maps;

import java.util.Map;
import java.util.TreeMap;

public class ExCharCount {

    public static void main(String[] args) {

        System.out.println(count("GARRAFA"));
        System.out.println(count("JAVA"));
        System.out.println(count("ORIENTACAO A OBJETOS"));
    }

    private static Map<Character, Integer> count(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();

        for (char c : chars) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        return map;
    }
}
