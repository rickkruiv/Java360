package javaCollectionsMain.arrays;

public class ArrayApp7 {

    public static void main(String[] args) {

//        int[][] array = new int[3][2];
//        array[0][1] = 9;
//        array[2][0] = 8;

        int[][] array =
            {
                {1, 2},
                {3, 4},
                {4, 5}
            };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
