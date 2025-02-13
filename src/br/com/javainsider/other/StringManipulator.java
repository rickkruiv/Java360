package br.com.javainsider.other;

public interface StringManipulator {

   default String upper(String string) {
      return string.toUpperCase();
   }
}
