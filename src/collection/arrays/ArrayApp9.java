package collection.arrays;

import java.util.Arrays;

public class ArrayApp9 {

    public static void main(String[] args) {

        String[] array = new String[5];
        Arrays.fill(array, "ABC");
        array[0] = "C";
        array[1] = "B";
        array[2] = "E";
        array[3] = "A";
        array[4] = "D";
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.binarySearch(array, "C"));

        String[] array2 = Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(array2));
    }
}
