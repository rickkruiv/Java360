package rpg.inventario;

import rpg.personagem.Personagem;

public class Armadura extends Item {

    private int defesaExtra;

    public Armadura( String nome, int defesaExtra ) {
        super( nome );
        this.defesaExtra = defesaExtra;
    }

    @Override
    public void usar( Personagem personagem ) {
        personagem.aumentarDefesa( defesaExtra );
        System.out.println( personagem.getNome() + " equipou " + super.getNome() + ". Defesa: " + personagem.getDefesa() );
    }
}
