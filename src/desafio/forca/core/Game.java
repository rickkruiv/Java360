package desafio.forca.core;

import java.util.HashSet;
import java.util.Set;

import desafio.forca.IO.Input;
import desafio.forca.IO.Output;

public class Game {

    private static final int MAX_CHANCES = 7;

    private int chancesLeft = MAX_CHANCES;
    private final Set<Character> letterUsed = new HashSet<>();

    public void start() {

        Dictionary dictionary = Dictionary.instace();
        Word word = dictionary.nextWord();
        printWord( word );
        
        while ( !word.revealed() && chancesLeft > 0 ) {
            
            char letter = readLetter( word ); 

            if ( word.reveal( letter ) ) {
                onHit( word );
            } else {
                onMiss();
            }

            letterUsed.add( letter );
            printWord( word );
        }
        onEnd( word );
    }

    private void printWord( Word word ) {
        Output.writeToConsole();
        Output.writeToConsole( word );
        Output.writeToConsole();
    }

    private char readLetter( Word word ) {
        while ( true ) {
            try {
                return validLetter( Input.readFromKeyboard( "Letter" ) );
            } catch( InvalidLetterException e ) {
                Output.writeToConsole( "Error: " + e.getMessage() );
            }
        }
    }

    private char validLetter( String text ) throws InvalidLetterException {

        String trimmedText = text.trim();

        if ( trimmedText.length() == 0 ) {
            throw new InvalidLetterException( "Vazio nao permitido" );
        } else if ( trimmedText.length() > 1 ) {
            throw new InvalidLetterException( "Apenas uma letra e permitido" );
        }

        char letter = trimmedText.charAt(0);

        if ( !Character.isLetter( letter ) ) {
            throw new InvalidLetterException( "Apenas letras sao permitidas" );
        }

        if ( letterUsed.contains( letter ) ) {
            throw new InvalidLetterException( "Letra ja usada" );
        }

        return letter;
    }

    private void onHit( Word word ) {
        if ( !word.revealed() ) {
            Output.writeToConsole( "Voce acertou" );
        }
    }

    private void onMiss() {
        chancesLeft--;
        Output.writeToConsole( "Voce errou" );
        Output.writeToConsole( "Chance(s) restante(s): " + chancesLeft );
    }

    private void onEnd( Word word ) {
        
        if ( word.revealed() ) {
            Output.writeToConsole( "Parabens, voce acertou!" );
        } else {
            word.show();
            Output.writeToConsole( "Deu ruim pra voce. Voce perdeu!" );
        }
    }
}
