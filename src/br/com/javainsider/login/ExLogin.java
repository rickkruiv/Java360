package br.com.javainsider.login;

public class ExLogin {

   public static void main(String[] args) {
      
      StaticLoginMethod login1 = new StaticLoginMethod();
      System.out.println(login1.login("admin", "admin123"));
      System.out.println(login1.login("admin", "admin"));

      System.out.println("-----------------------------------------");

      SameCredentialLogin login2 = new SameCredentialLogin();
      System.out.println(login2.login("user", "user123"));
   
      System.out.println("-----------------------------------------");
   
      StaticLoginMethod login3 = new StaticLoginMethod("hen", "hen");
      System.out.println(login3.login("hen", "hen"));
      System.out.println(login3.login("hen", "hen123"));
   }
}
