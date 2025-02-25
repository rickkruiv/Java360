package collection.arrays;

import java.util.Arrays;

public class ExExp {

    public static void main(String[] args) {
        int[] array = { 2, 6, 10 };
        exp(array);
        System.out.println(Arrays.toString(array));
    }

    private static void exp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
    }
}
