package javaExceptionsMain.vehicle;

public class ExVehicle {

   public static void main( String[] args ) {

      Vehicle carro = new Vehicle(40);
      
      carro.accelerate();
      System.out.println( carro.getSpeed() );
      
      carro.accelerate();
      System.out.println( carro.getSpeed() );
      
      carro.accelerate();
      System.out.println( carro.getSpeed() );
      
      carro.accelerate();
      System.out.println( carro.getSpeed() );
   }
}
