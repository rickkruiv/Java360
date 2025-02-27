package desafio.rpg.personagem;

import desafio.rpg.habilidade.Habilidade;

public class Mago extends Personagem implements Habilidade {
    public int mana = 50;

    public Mago( String nome ) {
        super( nome, 80, 25, 5 );
    }

    @Override
    public void atacar( Personagem alvo ) {         
        alvo.receberDano( getAtaque() );            
    }

    @Override
    public void usarHabilidade( Personagem alvo ) {

        System.out.println( "\u001B[34mBOLA DE FOGO!\u001B[0m" );
        if ( mana >= 10 ) {
            alvo.receberDano( getAtaque() + 10 );
            mana -= 10;
        } else { 
            System.out.println( "\u001B[34m" + getNome() + " está com pouca mana!\u001B[0m" );
        }
    }
}
