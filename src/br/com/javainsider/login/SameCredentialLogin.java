package br.com.javainsider.login;

public class SameCredentialLogin implements LoginMethod {

   @Override
   public boolean login(String username, String password) {
      return username.equals(password);
   }
}
