package java_exceptions_main.vehicle;

public class Vehicle {

   private int speed;

   public Vehicle( int speed ) {
      this.speed = speed;
   }

   public int accelerate() {

      if ( speed * 2 > 200 ) {
         throw new ExcessiveSpeedException( "\u001B[31mVelocidade máxima foi atingida\u001B[0m" );
      }
      speed *= 2;
      return speed;
   }

   public int getSpeed() {
      return speed;
   }
}
