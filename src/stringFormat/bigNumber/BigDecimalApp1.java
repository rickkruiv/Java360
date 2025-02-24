package stringFormat.bigNumber;

import java.math.BigDecimal;

public class BigDecimalApp1 {

    public static void main(String[] args) {

        BigDecimal big = new BigDecimal("34473897.10");
        big = big.multiply(BigDecimal.TEN);

        System.out.println(big);
    }
}
