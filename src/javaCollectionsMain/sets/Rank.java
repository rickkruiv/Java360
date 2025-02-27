package javaCollectionsMain.sets;

import java.util.Set;
import java.util.TreeSet;

public class Rank {

    private final Set<Player> players = new TreeSet<>( new PlayerComparator() );

    public void addPlayer( String name, int score ) {
        players.add( new Player( name, score ) );
    }

    public void printRanking() {
        
        int posicao = 1;
        for ( Player player : players ) {
            System.out.printf( "%3s - %-20s\t%-5s\n", posicao++, player.name(), player.score() );
        }
    }
}
