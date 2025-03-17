package bootCamp.jogoDaVelha.core;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

import static java.util.Objects.requireNonNull;

public class Board {

    public static final int SIZE = 3;
    private final Symbol[][] matrix = new Symbol[ SIZE ][ SIZE ]; 

    public Board() {

        for ( Symbol[] symbols : matrix ) {
            Arrays.fill( symbols, Symbol.NONE );
        }
    }

    @Override
    public String toString() {

        StringWriter stringWriter = new StringWriter();
        PrintWriter  out  = new PrintWriter( stringWriter );
        
        for ( int i = 0; i < SIZE; i++ ) {

            boolean first = true;

            for ( int j = 0; j < SIZE; j++ ) {

                if ( !first ) { 
                    out.print( " | ");
                }
                out.print( matrix[i][j]);
                first = false;
            }

            out.println();
            
            for ( int j = 0; j < SIZE && i < SIZE-1; j++ ) {

                out.print( "---"); 
            }
            out.println();
        }

        return stringWriter.toString();
    }

    public Symbol update( Symbol symbol, Coord coord ) {

        requireNonNull( symbol );
        requireNonNull( coord );

        if ( symbol == Symbol.NONE ) {
            throw new IllegalArgumentException( "None cannot be added to board" );
        }

        if ( matrix[coord.x()][coord.y()] != Symbol.NONE  ) {
            throw new IllegalArgumentException( "Play is not possible" );
        }

        matrix[coord.x()][coord.y()] = symbol;
        return findWinner();
    }

    public boolean isFull() {

        for( int i = 0; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                if ( matrix[i][j] == Symbol.NONE ) {
                    return false;
                }
            }
        }
        return true;
    }  

    private Symbol findWinner() {

        Symbol symbol = findSequenceRows();
        if( symbol != null ) {
            return symbol;
        }

        symbol = findSequenceColumns();
        if( symbol != null ) {
            return symbol;
        }

        return findSequenceDiagonals();
    }

    private Symbol findSequenceRows() {
        
        for( int i = 0; i < SIZE; i++ ) {
            Symbol symbol = findSequenceInRow( i );

            if ( symbol != null ) {
                return symbol;
            }
        }

        return null;
    }

    private Symbol findSequenceInRow( int i ) {
        return ( matrix[i][0] == matrix[i][1] && 
                 matrix[i][1] == matrix[i][2] && 
                 matrix[i][0] != Symbol.NONE ) ? 
                 matrix[i][0] : null;
    }

    private Symbol findSequenceColumns() {
        
        for( int i = 0; i < SIZE; i++ ) {
            Symbol symbol = findSequenceInColumn( i );

            if ( symbol != null ) {
                return symbol;
            }
        }

        return null;
    }

    private Symbol findSequenceInColumn( int i ) {
        return ( matrix[0][i] == matrix[1][i] && 
                 matrix[1][i] == matrix[2][i] && 
                 matrix[0][i] != Symbol.NONE ) ? 
                 matrix[0][i] : null;
    }

    private Symbol findSequenceDiagonals() {
     
        if ( matrix[0][0] == matrix[1][1] && 
             matrix[1][1] == matrix[2][2] && 
             matrix[0][0] != Symbol.NONE ) {
            
            return matrix[0][0];
        } else if ( matrix[0][2] == matrix[1][1] && 
                    matrix[1][1] == matrix[2][0] && 
                    matrix[0][0] != Symbol.NONE ) {
            return matrix[0][2];
        }
        
        return null;
    }
}
