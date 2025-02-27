package desafio.rpg.personagem;

import java.util.Random;

import desafio.rpg.habilidade.Habilidade;

public class Arqueiro extends Personagem implements Habilidade {
    
    private Random random = new Random();

    public Arqueiro( String nome ) {
        super( nome, 90, 18, 10 );
    }

    @Override
    public void atacar( Personagem alvo ) {
        
        int danoFinal = getAtaque(); 

        System.out.println( getNome() + "\u001B[33matacou com seu arco!\u001B[0m" );
        alvo.receberDano( danoFinal );
    }

    public void atacar( Personagem alvo, int danoFinal ) {

        System.out.println( "\u001B[32m" + getNome() + " acertou um CRITICO!\u001B[0m" );
        alvo.receberDano( danoFinal );
    }
    

    @Override
    public void usarHabilidade( Personagem alvo ) {
        System.out.println( "\u001B[34mTIRO PRECISO!\u001B[0m" );

        boolean critico   = random.nextDouble() < 0.3;
        int     danoFinal = critico ? 2 * getAtaque() : getAtaque();
        atacar( alvo, danoFinal );
    }
}
