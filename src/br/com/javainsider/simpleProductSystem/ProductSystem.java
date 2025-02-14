package br.com.javainsider.simpleProductSystem;

public class ProductSystem {

   public static void main(String[] args) {

      Produto produto1 = new Produto();
      produto1.setNome("X-Burguer");
      produto1.setPreco(15.99);

      Produto produto2 = new Produto();
      produto2.setNome("Batata Frita Pequena");
      produto2.setPreco(8.50);

      Produto produto3 = new Produto();
      produto3.setNome("Coca-Cola 350ml");
      produto3.setPreco(5.50);

      Pedido pedido = new Pedido();
      pedido.adicionarProduto(produto1);
      pedido.adicionarProduto(produto2);
      pedido.adicionarProduto(produto3);

      pedido.exibirPedido();
   }
}
