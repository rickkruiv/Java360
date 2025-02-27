package javaCollectionsMain.sets;

import java.util.HashSet;

public class SetApp3 {

    public static void main(String[] args) {
        var a1 = new AccountFail("123", 100);
        var a2 = new AccountFail("456", 200);
        var a3 = new AccountFail("456", 200);

        var accounts = new HashSet<AccountFail>();
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);

        for (var account : accounts) {
            System.out.println(account);
        }

        System.out.println(accounts.contains(a1));
        System.out.println(accounts.contains(a2));
        System.out.println(accounts.contains(a3));
    }
}
