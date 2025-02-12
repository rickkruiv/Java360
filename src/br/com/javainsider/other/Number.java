package br.com.javainsider.other;

public class Number {

   private        int number;
   private static int instaces;

   private Number(int number) {
      this.number = number;
      instaces++;
   }

   public int getNumber() {
      return number;
   }

   public static int getInstaces() {
      return instaces;
   }

   public static Number add(Number number1, Number number2) { // Não depende de nada, tem haver com a classe Number
      return new Number(number1.getNumber() + number2.getNumber());
   }

   public static Number newNumber(int number2) {
      return new Number(number2);
   }
}