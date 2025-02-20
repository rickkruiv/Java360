package enumApps;

public enum Month {
   JANEIRO( 1 ), 
   FEVEREIRO( 2 ),
   MARCO( 3 ), 
   ABRIL( 4 ), 
   MAIO( 5 ), 
   JUNHO( 6 ), 
   JULHO( 7 ), 
   AGOSTO( 8 ), 
   SETEMBRO( 9 ), 
   OUTUBRO( 10 ), 
   NOVEMBRO( 11 ), 
   DEZEMBRO( 12 );

   private final int monthNum;

   Month( int monthNum ) { this.monthNum = monthNum; }

   public int getMonthNum() { return monthNum; }

   public int numberOfDays() {

      return switch ( this ) {
         case JANEIRO, MARCO, MAIO, JULHO, AGOSTO, OUTUBRO, DEZEMBRO -> 31;
         case FEVEREIRO -> 28;
         case ABRIL, JUNHO, SETEMBRO, NOVEMBRO -> 30;
      };
   }

   @Override
   public String toString() { return "MÊS: " + name(); }
}
