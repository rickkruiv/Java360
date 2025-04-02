package innerClassesMain.anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousInnerClassApp3 {

    public static void main(String[] args) {
        var numbers = Arrays.asList(3, 2, 1, 5, 4);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        numbers.sort(c);
        System.out.println(numbers);
    }
}
