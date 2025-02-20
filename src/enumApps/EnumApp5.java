package enumApps;

import static enumApps.Car.Brand.BMW;

public class EnumApp5 {

   public static void main(String[] args) {
      
      // Car car = new Car( Car.Brand.BMW );
      Car car = new Car(BMW);
      System.out.println(car);
   }
}
 