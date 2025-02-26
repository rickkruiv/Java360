package collection.sets;

public class ExRank {

    public static void main(String[] args) {
        
        Rank rank = new Rank();

        rank.addPlayer( "Jose"     , 16900   );
        rank.addPlayer( "Paulo"    , 2710  );
        rank.addPlayer( "Carlos"   , 3811  );
        rank.addPlayer( "Henrique" , 90912  );
        rank.addPlayer( "Vanderson", 51013 );
        rank.addPlayer( "Cleber"   , 61114 );

        rank.printRanking();
    }
}
