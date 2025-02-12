package br.com.javainsider.other;

public class Fraction {

   int numerador;
   int denominador;

   public void setToFraction(int numerador, int denominador) {
      this.numerador = numerador;
      this.denominador = denominador;
   }

   public Fraction multply(Fraction fraction) {
      Fraction razao = new Fraction();

      razao.numerador = numerador * fraction.numerador;
      razao.denominador = denominador * fraction.denominador;

      return razao;
   }

   public void showResult() {
      System.out.println(numerador + " / " + denominador);
   }
}
