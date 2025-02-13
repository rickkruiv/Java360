package br.com.javainsider.walk;

public class Person implements Walkable {

   private int step;
   private int distancePerStep;

   @Override
   public void walk() {
      step++;
      distancePerStep += 10;
   }

   @Override
   public void stop() {
      step = 0;
   }

   public void print() {
      System.out.println("Step.....: " + step           );
      System.out.println("Distance.: " + distancePerStep);
   }
}
