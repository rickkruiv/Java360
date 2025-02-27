package javaSpecialTypesMain.enumApps;

public class EnumApp2 {

   public static void main(String[] args) {
      
      Month month = Month.DEZEMBRO;

      System.out.println(month);
      System.out.println(month.getMonthNum());
      System.out.println(month.ordinal());
      
      Month month2 = Month.valueOf("JANEIRO");
      System.out.println(month2);
   }
}
