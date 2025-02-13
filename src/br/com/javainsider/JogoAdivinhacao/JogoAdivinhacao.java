package br.com.javainsider.JogoAdivinhacao;

import java.util.Scanner;

public class JogoAdivinhacao {

   public static void main( String[] args ) {

      Scanner scan = new Scanner( System.in );
      System.out.print( "Digite seu nome: " );
      String nomeJogador = scan.nextLine();

      Jogador jogador = new Jogador( nomeJogador );
      Jogo jogo = new Jogo( 10, jogador );
      jogo.iniciaJogo();
      jogo.mostraPalpites();

      scan.close();
   }
}
