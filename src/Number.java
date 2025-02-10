public class Number {

   private int number;
   private static int instaces;

   public Number(int number) {
      this.number = number;
      instaces++;
   }

   public int getNumber() {
      return number;
   }

   public static int getInstaces() {
      return instaces;
   }

   public static Number add(Number number1, Number number2) { // Não depende de nada, tem haver com a classe Number
      return new Number(number1.getNumber() + number2.getNumber());
   }

   public static void main(String[] args) {

      Number a1 = new Number(10);

      Number a2 = new Number(5);
      
      Number a3 = Number.add(a1, a2);
      
      System.out.println("a1: " + a1.getNumber());
      System.out.println("a2: " + a2.getNumber());
      System.out.println("a3: " + a3.getNumber());
      System.out.println("Números de instâncias: " + Number.getInstaces());

   }
}
