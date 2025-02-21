package rpg.inventario;

import rpg.personagem.Personagem;

public class PocaoDeCura extends Item {

    private int cura;

    public PocaoDeCura( String nome, int cura ) {
        super( nome );
        this.cura = cura;
    }

    @Override
    public void usar(Personagem personagem) {
        personagem.recuperarVida( personagem.getVida() + cura );
        System.out.println( personagem.getNome() + " usou " + getNome() + ". Vida: " + personagem.getVida() );
    }
}
