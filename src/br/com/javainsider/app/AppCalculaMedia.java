package br.com.javainsider.app;

public class AppCalculaMedia {
   
   public static void main( String[] args ) {

      var scanner = new java.util.Scanner( System.in );
      String situacao;

      System.out.print( "Nome do Aluno: " );
      String nomeAluno = scanner.nextLine();

      System.out.print( "Primeira nota: " );
      double nota1 = Double.parseDouble( scanner.nextLine() );

      System.out.print( "Segunda nota: " );
      double nota2 = Double.parseDouble( scanner.nextLine() );

      System.out.print( "Terceira nota: " );
      double nota3 = Double.parseDouble( scanner.nextLine() );

      double media = ( nota1 + nota2 + nota3 ) / 3;

      if ( media >= 6.0 || media >= 60.0 ) {
         situacao = "Aprovado";
      } else if ( media >= 4.0 || media >= 40.0 ) {
         situacao = "Dependencia";
      } else {
         situacao = "Reprovaddo";
      }

      System.out.println( "O aluno " + nomeAluno + " esta " + situacao + " e sua média é de " + String.format( "%.1f", media) );
      scanner.close();

   }

}
