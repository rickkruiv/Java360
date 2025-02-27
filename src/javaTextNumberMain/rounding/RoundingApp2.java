package javaTextNumberMain.rounding;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingApp2 {

    public static void main(String[] args) {

        BigDecimal d = BigDecimal.valueOf(10.43);
        d = d.setScale(0, RoundingMode.UP);

        System.out.println(d);
    }
}
