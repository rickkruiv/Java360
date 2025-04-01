package innerClassesMain.regular;

public class RegularInnerClassApp1 {

    public static void main(String[] args) {

        Operation op = new Operation(6, 3);
        int result = op.execute();
        System.out.println(result);
    }
}
