package javaCollectionsMain.arrays;

import java.util.Arrays;

public class ExBubbleSort {

    public static void main(String[] args) {
        int[] array = { 8, 5, 1, 0, 4, 2, 3, 9, 7, 6 };
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
}
