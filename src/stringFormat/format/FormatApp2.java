package stringFormat.format;

public class FormatApp2 {

    public static void main(String[] args) {

        var account1 = new Account( "45432-1"  , "Pedro Duarte"     , 150    );
        var account2 = new Account( "100-2"    , "Maria Silva"      , 1430.2 );
        var account3 = new Account( "4387328-0", "Roberto Teixeira" , 0      );
        var account4 = new Account( "99787-1"  , "Joana Junqueira"  , 99.5   );

        System.out.println( account1 );
        System.out.println( account2 );
        System.out.println( account3 );
        System.out.println( account4 );
    }
}
