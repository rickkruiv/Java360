package rpg.personagem;

import rpg.inventario.Inventario;

public abstract class Personagem {

    private String     nome;
    private int        vida;
    private int        ataque;
    private int        defesa;
    private Inventario inventario;
    
    public Personagem( String nome, int vida, int ataque, int defesa  ) {
        this.nome       = nome;
        this.vida       = vida;
        this.ataque     = ataque; 
        this.defesa     = defesa; 
        this.inventario = new Inventario();
    }

    public String     getNome()       { return nome;       }
    public int        getVida()       { return vida;       }
    public int        getAtaque()     { return ataque;     }
    public int        getDefesa()     { return defesa;     }
    public Inventario getInventario() { return inventario; }

    public void recuperarVida( int vida )    { this.vida   += vida;   }
    public void aumentarAtaque( int ataque ) { this.ataque += ataque; }
    public void aumentarDefesa( int defesa ) { this.defesa += defesa; }
    
    public abstract void atacar( Personagem alvo );
    
    public boolean estaVivo() { return vida > 0; }

    public void receberDano( int dano ) {

        int danoFinal = Math.max( 0, dano - defesa );
        vida -= danoFinal;
        System.out.println( nome + " recebeu " + danoFinal + " de dano!" );
        System.out.println( "Vida restante: "  + vida );
    }

    @Override
    public String toString() {
        return String.format( "Nome: %-20s \t Vida: %d", nome, vida );
    }

    public static void placar( Personagem[] personagems ) {

        System.out.println("-- Situação ------------------------------");
        for (Personagem personagem : personagems) {
            System.out.printf( "Nome: %-20s \t Vida: %d\n", personagem.nome, personagem.vida );
        }
        System.out.println("------------------------------------------");
    }
}
