package collection.sets;

import java.util.Comparator;
import java.util.TreeSet;

public class SetApp5 {

    public static void main(String[] args) {

        //var set = new TreeSet<>(new AccountComparator());
        var set = new TreeSet<>(Comparator.comparing(AccountOrdering::getBalance).reversed());
        set.add(new AccountOrdering("431", 100));
        set.add(new AccountOrdering("111", 200));
        set.add(new AccountOrdering("678", 300));

        System.out.println(set);
    }
}
