package br.com.javainsider.shape;

public class Rectangule implements Shape {

   private final double width;
   private final double height;

   public Rectangule(double width, double height) {
      this.width  = width;
      this.height = height;
   }

   @Override
   public double surfaceArea() {
      return width * height;
   }
}
