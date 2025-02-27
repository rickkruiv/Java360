package javaCollectionsMain.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex {

    public static void main(String[] args) {
        var people = List.of(
            new Person(1, "José"),
            new Person(2, "Paulo"),
            new Person(3, "Maria"),
            new Person(4, "Joana")
        );

        Map<Long, String> map = new HashMap<>();

        for (Person person : people) {
            map.put(person.id(), person.name());
        }

        System.out.println(map);
    }
}
