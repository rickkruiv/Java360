package javaCollectionsMain.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListApp7 {

    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(6, 5, 7, 1, 3, 2, 4));
        list.sort(new DescendingComparator());
        System.out.println(list);

        list.sort(new DescendingComparator().reversed());
        System.out.println(list);

        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
