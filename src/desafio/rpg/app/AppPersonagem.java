package desafio.rpg.app;

import desafio.rpg.inventario.Armadura;
import desafio.rpg.inventario.Espada;
import desafio.rpg.inventario.PocaoDeCura;
import desafio.rpg.personagem.*;

public class AppPersonagem {

    public static void main(String[] args) {

        Mago       diogo    = new Mago("Diogo");
        Guerreiro  henrique = new Guerreiro("Henrique");

        henrique.getInventario().adicionarItem( new Armadura( "Armadura dos Deuses", 20 ) );
        henrique.getInventario().adicionarItem( new Espada( "Espada de Netherite", 10 ) );
        henrique.getInventario().adicionarItem( new PocaoDeCura( "Poção de Cura", 10 ) );
        
        diogo.getInventario().adicionarItem( new Armadura( "Armadura Encantada", 15 ) );
        diogo.getInventario().adicionarItem( new Espada( "Varinha Magica", 15 ) );
        diogo.getInventario().adicionarItem( new PocaoDeCura( "Poção Regeneração", 20 ) );

        System.out.println("-- Jogadores -----------------------------");
        System.out.println( henrique );
        System.out.println( diogo );
        System.out.println("------------------------------------------");

        henrique.getInventario().usarItem( 1, henrique );
        diogo.getInventario().usarItem( 0, diogo );
        henrique.atacar( diogo );
        
        Personagem[] personagems = { henrique, diogo };
        Personagem.placar( personagems );

        diogo.getInventario().verInventario();
        henrique.getInventario().verInventario();
    }
}
