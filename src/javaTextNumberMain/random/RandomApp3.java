package javaTextNumberMain.random;

import java.util.Random;

public class RandomApp3 {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(0, 101));
        }
    }
}
