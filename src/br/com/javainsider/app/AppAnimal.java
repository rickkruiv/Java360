package br.com.javainsider.app;

import br.com.javainsider.animal.*;

public class AppAnimal {
   
   public static void main(String[] args) {

      System.out.println("--> CAT");
      Cat cat = new Cat();
      cat.setColor("White");
      cat.walk();
      cat.talk();

      System.out.println("--> DOG");
      Dog dog = new Dog();
      dog.setColor("Black");
      dog.walk();
      dog.talk();

      System.out.println("--> FISH");
      Fish fish = new Fish();
      fish.setColor("Gold");
      fish.swim();

   }
}
