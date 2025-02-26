package collection.sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExGroceriesList {

    public static void main(String[] args) {
        List<String> itens = new ArrayList<>();
        itens.add("azeite");
        itens.add("arroz");
        itens.add("macarrão");
        itens.add("óleo");
        itens.add("azeite");
        itens.add("queijo");
        itens.add("feijão");
        itens.add("macarrão");
        itens.add("tomate");
        itens.add("queijo");

        removeDuplicates(itens);

        for (var item : itens) {
            System.out.println(item);
        }
    }

    private static void removeDuplicates(List<String> itens) {
        Set<String> set = new LinkedHashSet<>(itens);
        itens.clear();
        itens.addAll(set);
    }
}
