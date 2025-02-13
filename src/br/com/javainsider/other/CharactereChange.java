package br.com.javainsider.other;

public interface CharactereChange {

   default String upper(String string) {
      return "*" + string.toUpperCase() + "*";
   }
}
