package br.com.javainsider.contaBancaria2;

import java.util.List;
import java.util.ArrayList;

public class Banco implements LoginMethod {

   private static List<ContaBancaria> contas;
   private static final String acesso = "admin";
   private static final String senha  = "mudar123";

   public Banco() {
      contas = new ArrayList<>();
   }

   public void criarConta(String titular, String senha) {

      ContaBancaria conta = new ContaBancaria(titular, senha);
      System.out.println("Conta Nº" + conta.getNumeroConta() + " criada");
      contas.add(conta);
   }

   public ContaBancaria buscarConta(String titular, String Senha) {

      for (ContaBancaria conta : contas) {
         if (conta.getTitular().equals(titular) && conta.getSenha().equals(Senha) ) {
            return conta;
         }
      }
      return null;
   }

   public static List<ContaBancaria> contasCadastradas() {
      return contas;
   }

   @Override
   public boolean login(String username, String password) {
      return acesso.equals(username) && senha.equals(password);
   }

   public static void printContasCadastradas() {
      System.out.println("----------");
      System.out.println("Contas cadastradas");
      for (ContaBancaria conta : Banco.contasCadastradas()) {
         System.out.println("Nº " + conta.getNumeroConta() + " Titular: " + conta.getTitular());
      }
   }
}
