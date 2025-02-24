package stringFormat.rounding;

public class RoundingApp1 {

    public static void main(String[] args) {

        double d = 10.4;
        long v = Math.round(d);
        System.out.println(v);

        long f = (long) Math.floor(d);
        System.out.println(f);

        long c = (long) Math.ceil(d);
        System.out.println(c);
    }
}
