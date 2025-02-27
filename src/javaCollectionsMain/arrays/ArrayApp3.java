package javaCollectionsMain.arrays;

import java.util.Arrays;

public class ArrayApp3 {

    public static void main(String[] args) {

        String[] array = new String[2];
        array[0] = "A";
        array[1] = "B";
        array[-1] = "D";
        array[2] = "C";

        System.out.println(Arrays.toString(array));
    }
}
