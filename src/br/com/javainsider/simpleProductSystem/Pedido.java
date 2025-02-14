package br.com.javainsider.simpleProductSystem;

import java.util.List;
import java.util.ArrayList;

public class Pedido {

   private List<Produto> produtos;

   public Pedido() {
      produtos = new ArrayList<>();
   }

   public void adicionarProduto( Produto produto ) {
      produtos.add(produto);
      System.out.println( "Produto adicionado: " + produto.getNome() + "- R$" + produto.getPreco() );
   }

   public double calcularTotal() {

      double total = 0;

      for ( Produto produto : produtos ) {
         total += produto.getPreco();
      }

      return total;
   }

   public void exibirPedido() {

      System.out.println("-----------------------------------------------------------------");
      System.out.println( "Resumo do Pedido" );
      for ( Produto produto : produtos ) {
         produto.exibirInfo();
      }
      System.out.println("-------------------------------------------------- " + "Total: R$" + String.format( "%.2f", calcularTotal() ) );
   }
}
