package collection.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListApp6 {

    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(6, 5, 7, 1, 3, 2, 4));
        Collections.sort(list);
        System.out.println(list);
    }
}
