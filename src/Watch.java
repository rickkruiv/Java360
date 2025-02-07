public class Watch {
   Pointer hour   = new Pointer();
   Pointer minute = new Pointer();
   Pointer second = new Pointer();

   void setTime( int hour, int minute, int second) {
      this.hour.number   = hour;
      this.minute.number = minute / 5;
      this.second.number = second / 5;
   }

   int readHour(){
      return hour.number;
   } 

   int readMinute(){
      return minute.number * 5;
   } 

   int readSecond(){
      return second.number * 5;
   } 

}
