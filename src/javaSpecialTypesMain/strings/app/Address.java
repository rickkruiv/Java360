package javaSpecialTypesMain.strings.app;

public class Address {

   private String street;
   private int number;
   private String complement;
   private String city;
   private String state;

   @Override
   public String toString() {
       return "Address{"        +
               "street='"       + street     + '\'' +
               ", number="      + number     +
               ", complement='" + complement + '\'' +
               ", city='"       + city       + '\'' +
               ", state='"      + state      + '\'' +
               '}';
   }
}
