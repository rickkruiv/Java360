package desafio.forca.core;

import desafio.forca.IO.Output;

public class Word {

    private static final char HIDDEN_CHAR = '_';
    private final char[] letters;
    private final char[] hiddenLetters;

    public Word( String text ) {
        letters = text.toUpperCase().toCharArray();
        hiddenLetters = String.valueOf( HIDDEN_CHAR ).repeat( text.length() ).toCharArray();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for ( char letter : hiddenLetters ) {
            stringBuilder.append( letter ).append( " " );
        }

        return "\u001B[33m" + String.valueOf( stringBuilder ) + "\u001B[0m";
    }

    public boolean reveal( char letter ) {

        boolean revealed = false;

        for ( int i = 0; i < letters.length; i++ ) {

            if ( letters[i] == letter ) {
                hiddenLetters[i] = letter;
                revealed = true;
            }
        }

        return revealed;
    }

    public boolean revealed() {
        return toString().indexOf( HIDDEN_CHAR ) == -1;
    }

    public void show() {
        Output.writeToConsole( "Palavra: " + String.valueOf( letters ) );
    }
}
