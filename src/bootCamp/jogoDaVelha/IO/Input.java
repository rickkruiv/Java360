package bootCamp.jogoDaVelha.IO;

import java.util.Scanner;

public final class Input {

    private Input() {}

    public static void read() {
        read( null );
    }

    @SuppressWarnings("resource")
    public static String read( String message ) {

        if ( message != null ) {
            Output.write( message + " ", false );
        }
        return new Scanner( System.in ).nextLine();
    }

}
