package br.com.javainsider.app;

import br.com.javainsider.other.Watch;

public class AppExWatch {
   
   public static void main(String[] args) {
      
      Watch watch = new Watch();

      watch.setTime(11, 30, 40);

      System.out.println(watch.readHour() + ":" + watch.readMinute() + ":" + watch.readSecond());
   }
}
