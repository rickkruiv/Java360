package collection.sets;

public class ExRank {

    public static void main(String[] args) {
        Rank rank = new Rank();

        rank.addPlayer("Player A", 200);
        rank.addPlayer("Player B", 650);
        rank.addPlayer("Player C", 0);
        rank.addPlayer("Player D", 900);
        rank.addPlayer("Player E", 450);

        rank.printRanking();
    }
}
