package javaTextNumberMain.bigNumber;

import java.math.BigDecimal;

public class BigDecimalApp3 {

    public static void main(String[] args) {

        BigDecimal n1 = BigDecimal.valueOf(1.0);
        BigDecimal n2 = BigDecimal.valueOf(1);

        System.out.println(n1.equals(n2));
        System.out.println(n1.compareTo(n2) == 0);
    }
}
