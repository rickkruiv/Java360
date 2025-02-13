package br.com.javainsider.login;

public class StaticLoginMethod implements LoginMethod {

   private static final String USERNAME = "admin";
   private static final String PASSWORD = "admin123";

   private String username;
   private String password;

   public StaticLoginMethod() {
      this(USERNAME, PASSWORD);
   }

   public StaticLoginMethod(String username, String password) {
      this.username = username;
      this.password = password;
   }   

   @Override
   public boolean login(String username, String password) {
      return username.equals(this.username) && password.equals(this.password);
   }
}
