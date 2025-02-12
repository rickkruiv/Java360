package br.com.javainsider.app;

import br.com.javainsider.other.Fraction;

public class AppFraction {

   public static void main(String[] args) {

      Fraction f1 = new Fraction();
      Fraction f2 = new Fraction();
      
      f1.setToFraction(12,  6);
      f1.showResult();

      f2.setToFraction(6,  4);
      f2.showResult();

      Fraction f3 = f1.multply(f2);
      f3.showResult();     

   }
}
