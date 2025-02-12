package br.com.javainsider.app;


public class AppExRectangule {

   public static void main(String[] args) {

      // Fully Qualifidd Name <- Isso aqui é inviável kkkkkkk ( ta maluco o tamnho do q tem q escrever ) 
      // Usado para quando você tem duas classes com o mesmo nome, porém com funções diferentes
      br.com.javainsider.other.Rectangule rectangule = new br.com.javainsider.other.Rectangule(8, 10);
      System.out.printf("Área do retâgulo: %.2f\n", rectangule.square());
   }
}