package br.com.javainsider.other;

public class StringManipulatorImpl implements StringManipulator, CharactereChange {

   @Override
   public String upper(String string) {
      return CharactereChange.super.upper(string);
   }
}
