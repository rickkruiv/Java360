package collection.lists;

import java.util.ArrayList;
import java.util.List;

public class ListApp8 {

    public static void main(String[] args) {
        var people = new ArrayList<>(List.of(
            new Person("Maria", 45),
            new Person("Paulo", 36),
            new Person("Pedro", 40)
        ));

        //Collections.sort(people);
        people.sort(new PersonComparator());

        for(var p: people) {
            System.out.format("==> %s\n", p);
        }
    }
}
