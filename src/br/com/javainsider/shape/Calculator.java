package br.com.javainsider.shape;

public class Calculator {

   private double total;

   public double sumSurfaceArea(Shape shape) {
       total += shape.surfaceArea();
       return total;
   }

   public double getTotal() {
      return total;
   }
}
