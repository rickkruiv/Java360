package collection.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapApp2 {

    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new LinkedHashMap<>();
        scoreMap.put("Player A", 300);
        scoreMap.put("Player B", 500);
        scoreMap.put("Player C", 200);
        scoreMap.put("Player D", 700);

        Set<String> keys = scoreMap.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

        Collection<Integer> values = scoreMap.values();

        for (Integer value: values) {
            System.out.println(value);
        }

        var entries = scoreMap.entrySet();

        for (var entry : entries) {
            System.out.format("%s ===> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
