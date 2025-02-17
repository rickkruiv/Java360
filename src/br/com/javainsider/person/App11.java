package br.com.javainsider.person;

public class App11 {

   public static void main(String[] args) {
      
      Person person = new Person("Henrique", "Polizer", 18);
      System.out.println(person);
      
      Person person2 = new Person("Henrique", "Polizer", 1);
      System.out.println(person2.equals(person));

      RecordPerson recordPerson = new RecordPerson("Joao", "Pedro", 19);
      System.out.println(recordPerson);
      
      RecordPerson recordPerson2 = new RecordPerson("Joao", "Pedro", 19);
      System.out.println(recordPerson2.equals(recordPerson));
      System.out.println(recordPerson.hashCode());


   }

}
