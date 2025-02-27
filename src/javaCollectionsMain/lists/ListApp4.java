package javaCollectionsMain.lists;

import java.util.Arrays;
import java.util.List;

public class ListApp4 {

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4 };

        List<Integer> list = Arrays.asList(array);
        System.out.println(list);

        Integer[] array2 = list.toArray(new Integer[4]);
        System.out.println(Arrays.toString(array2));

        List<Integer> l2 = Arrays.asList(new Integer[] { 1, 2, 3, 4});
        System.out.println(l2);
    }
}
