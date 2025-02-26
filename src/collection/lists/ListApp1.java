package collection.lists;

import java.util.ArrayList;
import java.util.List;

public class ListApp1 {

    public static void main(String[] args) {

        //var l1 = new ArrayList<Integer>();
        List<Integer> l1 = new ArrayList<>();

        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(7);

        l1.remove(1);

        for (Integer i: l1) {
            System.out.println(i);
        }

        System.out.println(l1.get(1));
    }
}
