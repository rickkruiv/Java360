public class Fraction {

   int numerador;
   int denominador;

   void setToFraction(int numerador, int denominador) {
      this.numerador = numerador;
      this.denominador = denominador;
   }

   Fraction multply(Fraction fraction) {
      Fraction razao = new Fraction();

      razao.numerador = numerador * fraction.numerador;
      razao.denominador = denominador * fraction.denominador;

      return razao;
   }

   void showResult() {
      System.out.println(numerador + " / " + denominador);
   }
}
