package enumApps;

public class EnumApp3 {

   public static void main(String[] args) {
      
      Dog dog = new Dog();
      talk( dog );
      talk( MyPet.MOUSE );
      talk( MyPet.CAT );
   }

   private static void talk( Pet pet ) {
      System.out.println( pet.talk() );
   }
}
