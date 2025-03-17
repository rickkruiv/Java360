package bootCamp.jogoDaVelha.core;

import static java.util.Objects.requireNonNull;

import bootCamp.jogoDaVelha.util.Validation;

public record Coord( int x, int y ) {

    public Coord {

        Validation.require( x >= 0 && x <= Board.SIZE, "X invalido" );
        Validation.require( y >= 0 && y <= Board.SIZE, "Y invalido" );
    }

    public static Coord parse( String text ) {

        requireNonNull(text);

        String[] tokens = text.split( "," );

        if ( tokens.length != 2 ) {
            throw new IllegalArgumentException( "Argumento inválido" );
        }

        try {
            return new Coord( Integer.parseInt( tokens[0] ), Integer.parseInt( tokens[1] ) );
        } catch( NumberFormatException e ) {
            throw new IllegalArgumentException( "Número invalido" );
        }

    }
}
