package br.com.javainsider.app;

import br.com.javainsider.other.Lamp;

public class AppLamp {

   public static void main(String[] args) {
      Lamp lamp1 = new Lamp(true);
      lamp1.showState(lamp1.getLigada());
      lamp1.turnOff();
      lamp1.turnOn();

      System.out.println("------------------------------------");
      Lamp lamp2 = new Lamp(false);
      lamp2.showState(lamp2.getLigada());
      lamp2.turnOn();
      lamp2.turnOff();
   }   
}
