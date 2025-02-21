package rpg.inventario;

import java.util.Random;

import rpg.personagem.Personagem;

public class Arco extends Item {

    private int    danoExtra;
    private double danoCritico;
    private Random random = new Random();

    public Arco( String nome, int danoExtra, double danoCritico ) {
        super( nome ); 
        this.danoExtra   = danoExtra;
        this.danoCritico = danoCritico;
    }

    @Override
    public void usar( Personagem personagem ) {

        danoExtra += personagem.getAtaque();
        
        boolean critico   = random.nextDouble() < danoCritico;
        int     danoFinal = critico ? 2 * danoExtra : danoExtra;
        
        personagem.aumentarAtaque( danoFinal );

        System.out.println( personagem.getNome() + " equipou " + getNome() + ". Ataque: " + personagem.getAtaque() );
    }
}
