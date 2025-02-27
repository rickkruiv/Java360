package desafio.rpg.personagem;

import desafio.rpg.habilidade.Habilidade;

public class Guerreiro extends Personagem implements Habilidade {

    public Guerreiro( String nome ) {
        super( nome, 100, 20, 10 );
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println( "\u001B[33m" + getNome() + " ataca " + alvo.getNome() +  " com sua espada!\u001B[0m" );
        alvo.receberDano( getAtaque() );
    }

    @Override
    public void usarHabilidade(Personagem alvo) {

        System.out.println( "\u001B[FURIA!\u001B[0m" );
        alvo.receberDano( getAtaque() + ( getAtaque() / 2 ) );
    }
}
