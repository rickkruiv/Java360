package javaTextNumberMain.bigNumber;

import java.math.BigInteger;

public class BigIntegerApp1 {

    public static void main(String[] args) {
        BigInteger big = new BigInteger("498374894574389754578647386574386574836547839");
        big = big.add(BigInteger.TEN);
        System.out.println(big.longValue());
        System.out.println(big);

        BigInteger big2 = BigInteger.valueOf(100);
        System.out.println(big2);
        System.out.println(big2.intValue());
    }
}
