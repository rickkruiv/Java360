package javaCollectionsMain.sets;

import java.util.TreeSet;

public class SetApp4 {

    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(3);
//        set.add(2);
//
//        System.out.println(set);

        var set = new TreeSet<AccountOrdering>();
        set.add(new AccountOrdering("431", 100));
        set.add(new AccountOrdering("111", 200));
        set.add(new AccountOrdering("678", 300));

        System.out.println(set);
    }
}
