package bootCamp.jogoDaVelha.IO;

public final class Output {

    private Output() {}

    public static void writeNewLine() {
        write( null );
    }

    public static void write( Object obj ) {
        write( obj, true );
    }

    public static void write( Object obj, boolean addNewLine ) {


        if ( obj == null ) {
            System.out.println();
        } else {

            if ( addNewLine ) {
                System.out.println( obj ); 
            } else { 
                System.out.print( obj ); 
            }
        }
    }
}
