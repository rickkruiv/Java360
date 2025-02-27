package desafio.rpg.inventario;

import java.util.ArrayList;
import java.util.List;

import desafio.rpg.personagem.Personagem;

public class Inventario {

    private List<Item> itens = new ArrayList<>();

    public void adicionarItem( Item item ) {
        itens.add( item );
        System.out.println( item.getNome() + " adicionado ao inventário." );
    }

    public void usarItem( int index, Personagem personagem) {

        if ( index >= 0 && index < itens.size() ) {
            Item item = itens.remove( index );
            item.usar( personagem );
        } else {
            System.out.println( "Não existe um item nesta posição" );
        }
    }

    public void verInventario() {

        System.out.println("-- Inventário ----------------------------");
        for (Item item : itens) {
            System.out.println( "- " + item.getNome() );
        }
        System.out.println("------------------------------------------");
    }
}
