package br.com.javainsider.app;

import br.com.javainsider.other.StringManipulatorImpl;

public class App09 {


   public static void main(String[] args) {
      
      StringManipulatorImpl SMI = new StringManipulatorImpl();

      System.out.println(SMI.upper("JAVA"));
   } 
}
