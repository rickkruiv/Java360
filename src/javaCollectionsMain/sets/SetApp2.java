package javaCollectionsMain.sets;

import java.util.HashSet;

public class SetApp2 {

    public static void main(String[] args) {
        Account a1 = new Account("123", 100);
        Account a2 = new Account("456", 200);
        Account a3 = new Account("456", 200);

        var accounts = new HashSet<Account>();
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);

        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
