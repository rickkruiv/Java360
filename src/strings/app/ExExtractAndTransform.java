package strings.app;

public class ExExtractAndTransform {

   public static void main(String[] args) {
      
      String converted = upperCase( "Java é bacana", "é" );
      System.out.println( converted );
   }

   public static String upperCase( String text, String piece ) {

      int pos = text.indexOf(piece);

      if ( pos < 0 ) {
         return text;
      }

      String transformed = text.substring( pos, pos + piece.length() ).toUpperCase();

      return text.substring( 0, pos ) + transformed + text.substring( pos + piece.length() );
   }
}
