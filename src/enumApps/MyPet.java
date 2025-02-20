package enumApps;

public enum MyPet implements Pet {

   CAT {
      @Override
      public String talk() {
         return "Squik";
      }
   },
   MOUSE {
      @Override
      public String talk() {
         return "Miau";
      }
   };

}
