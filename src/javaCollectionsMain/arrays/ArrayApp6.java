package javaCollectionsMain.arrays;

public class ArrayApp6 {

    public static void main(String[] args) {
        int[] x = { 10 };
        increment(x);
        System.out.println(x[0]);
    }

    private static void increment(int[] array) {
        array[0]++;
    }
}
