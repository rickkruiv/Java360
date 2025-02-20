package enumApps;

public class Car {

   public enum Brand {
      BMW, AUDI, VW
   }

   private final Brand brand;

   public Car(Brand brand) {
      this.brand = brand;
   }

   public Brand getBrand() {
      return brand;
   }
}
