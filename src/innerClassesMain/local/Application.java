package innerClassesMain.local;

public class Application {

    private final String message = "Hi";

    public void greet( String name ) {

        final String upperName = name.toUpperCase();

        class Gretter {
            public void sayHi() {
                System.out.format( "%s, %s!", message, upperName );
            } 
        }

        Gretter gretter = new Gretter();
        gretter.sayHi();
    }
}
