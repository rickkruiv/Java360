package br.com.javainsider.other;

public class Rectangule {
   
   private final double height;
   private final double width;
   private final double square;

   public Rectangule(double width, double height) {
      this.width  = width;
      this.height = height;
      square      = this.width * this.height;
   }

   public Rectangule(double width) {
      this(width, width);
   }

   public double square() {
      return square;
   }

}
