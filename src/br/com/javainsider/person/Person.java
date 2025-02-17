package br.com.javainsider.person;

import java.util.Objects;

public class Person {

   private final String firstName;
   private final String lastName;
   private final int    age;

   public Person( String firstName, String lastName, int age ) {
      this.firstName = firstName;
      this.lastName  = lastName;
      this.age       = age;
   }
   
   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public int getAge() {
      return age;
   }

   @Override
   public String toString() {
   return "Person { " + 
                     "firstName:'" + firstName + '\'' +
                     "lastName:'"  + lastName  + '\'' +
                     "age: "       + age       +  "''}";
   }

   @Override
   public boolean equals(Object obj) {
      if ( this == obj  ) return true;
      if ( obj  == null ) return false;
      Person person = (Person) obj;
      return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals( lastName, person.lastName );
   }

   @Override
   public int hashCode() {
      return Objects.hash(firstName, lastName, age);
   }

}
