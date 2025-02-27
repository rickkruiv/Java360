package desafio.rpg.inventario;

import desafio.rpg.personagem.Personagem;

public abstract class Item {

    private String nome;

    public Item( String nome ) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void usar( Personagem personagem );
}

