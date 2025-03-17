package bootCamp.jogoDaVelha.util;

public final class Validation {

    private Validation() {}

    public static void require( boolean condition, String errorMessage ) {
    
        if ( !condition ) {
            throw new IllegalArgumentException( errorMessage );
        } 
    } 
}
