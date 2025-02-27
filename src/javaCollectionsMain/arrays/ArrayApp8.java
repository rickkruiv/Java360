package javaCollectionsMain.arrays;

public class ArrayApp8 {

    public static void main(String[] args) {
        int[][] array = new int[4][];

        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[5];
        array[3] = new int[1];

        for(int[] d1 : array) {
            for(int d2 : d1) {
                System.out.print(d2 + " ");
            }
            System.out.println();
        }
    }
}
