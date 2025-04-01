package innerClassesMain.regular;

public class RegularInnerClassApp2 {

    public static void main(String[] args) {

        Car car = new Car();
        car.accelerate();
        car.accelerate();
        System.out.println(car.getSpeed());
    }
}
