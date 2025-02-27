package javaCollectionsMain.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListApp3 {

    public static void main(String[] args) {
        var list = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.equals("C")) {
                iter.remove();
            }
        }

        System.out.println(list);
    }
}
