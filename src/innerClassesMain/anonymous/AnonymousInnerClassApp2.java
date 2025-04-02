package innerClassesMain.anonymous;

public class AnonymousInnerClassApp2 {

    public static void main(String[] args) {

        Food food1 = new Food();
        food1.eat();

        Food food2 = new Food() {
            @Override
            public void eat() {
                System.out.println("Eating fish!");
            }
        };
        food2.eat();
    }
}
