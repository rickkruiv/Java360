package br.com.javainsider.app;

// Aqui é mais prático e viável 
import br.com.javainsider.other.Number;

public class AppExNumber {
   public static void main(String[] args) {

      Number a1 = Number.newNumber(10);

      Number a2 = Number.newNumber(5);
      
      Number a3 = Number.add(a1, a2);
      
      System.out.println("a1: " + a1.getNumber());
      System.out.println("a2: " + a2.getNumber());
      System.out.println("a3: " + a3.getNumber());
      System.out.println("Números de instâncias: " + Number.getInstaces());

   }
}
