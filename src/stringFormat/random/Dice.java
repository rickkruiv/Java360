package stringFormat.random;

import java.util.Random;

public class Dice {

    private final Random random = new Random();

    public Numbers roll() {
        return new Numbers( nextNumber(), nextNumber() );
    }

    private int nextNumber() {
        return random.nextInt( 1, 7 );
    }
}
