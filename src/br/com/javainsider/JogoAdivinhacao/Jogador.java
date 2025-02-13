package br.com.javainsider.JogoAdivinhacao;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

   private String nome;
   private List<Integer> palpites;

   public Jogador( String nome ) {
      this.nome     = nome;
      this.palpites = new ArrayList<>(); 
   }

   public String getNome() {
      return nome;
   }

   public void registrarPalpite( int palpite ) {
      palpites.add( palpite );
   }

   public List<Integer> getPalpites() {
      return palpites;
   }
}
