package br.com.javainsider.shape;

public class ExShape {

   public static void main(String[] args) {

      Calculator calc = new Calculator();
      calc.sumSurfaceArea(new Circle(2));
      calc.sumSurfaceArea(new Rectangule(2, 4));
      calc.sumSurfaceArea(new Square(2));

      System.out.println();

      System.out.println(String.format("%.2f", calc.getTotal()));
   }
}
