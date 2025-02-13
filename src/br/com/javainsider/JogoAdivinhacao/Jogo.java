package br.com.javainsider.JogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
   
   private int tentativas;
   private int numeroSecreto;
   private int maxTentativas;
   private Jogador jogador;

   public Jogo( int maxTentativas, Jogador jogador ) {
      this.numeroSecreto = gerarNumeroAleatorio();
      this.maxTentativas = maxTentativas;
      this.jogador       = jogador;
   }
   
   private int gerarNumeroAleatorio() {
      Random random = new Random();
      return random.nextInt( 100 ) + 1;
   }

   public String verificaPalpite( int palpite ) {
      if ( palpite > numeroSecreto ) { 
         return "\u001B[33mNumero que penso é menor!\u001B[0m";
      } else if (palpite < numeroSecreto) { 
         return "\u001B[33mNumero que penso é maior!\u001B[0m";
      } else {
         return "Parabéns, " + jogador.getNome() + "! Você acertou!";
      }
   }

   public void iniciaJogo() {

      Scanner scan = new Scanner(System.in);
      System.out.println("\u001B[32m------------------------------------------------------------------------------\u001B[0m" );
      System.out.println( "\u001B[32m>\u001B[0m Muito bem vindo, " + jogador.getNome() + "! Este é o jogo da adivinhação!    " );
      System.out.println( "\u001B[32m>\u001B[0m Tente adivinhar em qual número estou pensando.                             " );
      System.out.println( "\u001B[32m>\u001B[0m Dica: O número está entre 1 e 100                                          " );
      System.out.println("\u001B[32m------------------------------------------------------------------------------\u001B[0m" );


      while ( tentativas < maxTentativas ) {

         System.out.print("Me diga qual número estou pensando: ");
         int palpite = scan.nextInt();
         jogador.registrarPalpite( palpite );
         tentativas++;

         String resultado = verificaPalpite( palpite );
         System.out.println(resultado);

         if ( palpite == numeroSecreto ) {
            break;
         }

         if ( tentativas >= maxTentativas ) { 
            System.out.println( "\u001B[31mVocê não conseguiu :/\u001B[0m"    );
            System.out.println( "Resposta: " + numeroSecreto );
          }
      }
      scan.close();
   }

   public void mostraPalpites() {
      System.out.println( "Seus palpites: " + jogador.getPalpites() ); 
   }
}
