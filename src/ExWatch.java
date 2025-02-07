public class ExWatch {
   
   public static void main(String[] args) {
      
      Watch watch = new Watch();

      watch.setTime(11, 30, 40);

      System.out.println(watch.readHour() + ":" + watch.readMinute() + ":" + watch.readSecond());
   }
}
