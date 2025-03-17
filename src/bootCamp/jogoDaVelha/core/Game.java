package bootCamp.jogoDaVelha.core;

import bootCamp.jogoDaVelha.IO.Input;
import bootCamp.jogoDaVelha.IO.Output;

public class Game {

    private final Board   board   = new Board();
    private final Players players = new Players();

    public void start() {

        System.out.println( "Jogo iniciado!" );
        Symbol winner = null;

        while ( winner == null && !board.isFull() ) {

            Output.writeNewLine();
            Output.write( board );
            winner = play( players.next() );
        }
        
        Output.write( board );

        if ( winner != null ) {
            Output.write( String.format( "%s ganhou o jogo", winner )  );
        } else {
            Output.write( "Deu velha!" );
        }

    }

    private Symbol play( Symbol symbol ) {
        
        while ( true ) {
                
            try {

                String play = Input.read( String.format( "( %s ) Play >>", symbol ) );
                Coord coord = Coord.parse( play );

                return board.update( symbol, coord );
            } catch ( RuntimeException e ) {
                Output.write( "ERROR: " + e.getMessage() );
            }
        }
    }
}
