package br.com.javainsider.other;

public class Lamp {

   private boolean ligada;

   public boolean getLigada() {
      return ligada;
   }

   public Lamp(boolean ligada) {
      this.ligada = ligada;
   }

   public void turnOff() {
      ligada = false;
      showState(ligada);
   } 

   public void turnOn() {
      ligada = true;
      showState(ligada);
   }

   public void showState( boolean ligada ) {
      System.out.println("Lâmpada " + (ligada ? "Ligada" : "Desligada"));
   }

}
