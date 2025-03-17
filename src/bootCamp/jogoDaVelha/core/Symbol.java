package bootCamp.jogoDaVelha.core;

public enum Symbol {

    X( 'X' ),
    O( 'O' ),
    NONE( ' ' );

    private final char charSymbol;

    Symbol( char charSymbol ) {
        this.charSymbol = charSymbol;
    }

    @Override
    public String toString() {
        return String.valueOf( charSymbol );
    }
}
