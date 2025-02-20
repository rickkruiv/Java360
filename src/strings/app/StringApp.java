package strings.app;

public class StringApp {

   public static void main(String[] args) {
   
      StringBuilder s = new StringBuilder();
      for ( char c = 'A'; c <= 'Z'; c++ ) {
         s.append(c);
      }
      System.out.println( s );
   }
}
