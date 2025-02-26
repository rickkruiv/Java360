package collection.sets;

import java.util.HashSet;
import java.util.Set;

public class SetApp1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U");
        set.add("U");
        set.add("I");

        for (String s : set) {
            System.out.println(s);
        }

        // set.size()
        // set.clear()
        // set.contains()
    }
}
