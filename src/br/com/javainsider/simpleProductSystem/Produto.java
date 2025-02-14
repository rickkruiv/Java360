package br.com.javainsider.simpleProductSystem;

public class Produto {

   private String nome;
   private double preco;

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setPreco(double preco) {
      this.preco = preco;
   }

   public String getNome() {
      return nome;
   }

   public double getPreco() {
      return preco;
   }  

   public void exibirInfo() {
      System.out.println( "Produto: " + getNome() + " - R$" + getPreco() );
   }

}