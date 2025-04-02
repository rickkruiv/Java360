package innerClassesMain.staticnested;

public class StaticNestedApp2 {

    public static void main(String[] args) {

        Operation op = new Operation(5, 7);
        int result = op.sum();
        op.sum();
        System.out.println(result);

        Operation.Counter counter = op.getCounter();
        System.out.println(counter.getValue());
    }
}
