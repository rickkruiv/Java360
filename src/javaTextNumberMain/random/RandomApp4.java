package javaTextNumberMain.random;

import java.util.UUID;

public class RandomApp4 {

    public static void main(String[] args) {

        UUID id = UUID.randomUUID();
        String s = id.toString();
        System.out.println(s);
    }
}
