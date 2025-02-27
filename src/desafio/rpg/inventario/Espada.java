package desafio.rpg.inventario;

import desafio.rpg.personagem.Personagem;

public class Espada extends Item {

    private int danoExtra;

    public Espada( String nome, int danoExtra ) {
        super( nome ); 
        this.danoExtra = danoExtra;
    }

    @Override
    public void usar( Personagem personagem ) {
        personagem.aumentarAtaque( danoExtra );
        System.out.println( personagem.getNome() + " equipou " + getNome() + ". Ataque: " + personagem.getAtaque() );
    }
}
