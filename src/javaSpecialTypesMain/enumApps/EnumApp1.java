package javaSpecialTypesMain.enumApps;

public class EnumApp1 {

   private enum Month {
      JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
   }
   
   public static void main( String[] args ) {
         Month primeiroMes = Month.JANEIRO;

         System.out.println(primeiroMes);
   }
}
