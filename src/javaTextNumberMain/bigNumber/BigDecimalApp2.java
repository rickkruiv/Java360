package javaTextNumberMain.bigNumber;

import java.math.BigDecimal;

public class BigDecimalApp2 {

    public static void main(String[] args) {

        //double amount = 1.09 - 0.62 + 0.54 - 2.0;

        BigDecimal amount = BigDecimal.valueOf(1.09);
        amount = amount.subtract(BigDecimal.valueOf(0.62));
        amount = amount.add(BigDecimal.valueOf(0.54));
        amount = amount.subtract(BigDecimal.valueOf(2));

        System.out.println(amount);
    }
}
