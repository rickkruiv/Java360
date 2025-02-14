package br.com.javainsider.contaBancaria;

import java.util.List;
import java.util.ArrayList;

public class Banco implements LoginMethod {

   private static List<ContaBancaria> contas;
   private static final String acesso = "admin";
   private static final String senha  = "mudar123";

   public Banco() {
      contas = new ArrayList<>();
   }

   public void criarConta(String titular) {

      ContaBancaria conta = new ContaBancaria(titular);
      System.out.println("Conta Nº" + conta.getNumeroConta() + " criada");
      contas.add(conta);
   }

   public ContaBancaria buscarConta(String numero) {

      for (ContaBancaria conta : contas) {
         if (conta.getNumeroConta().equals(numero)) {
            return conta;
         }
      }
      return null; // se n achar
   }

   public static List<ContaBancaria> contasCadastradas() {
      return contas;
   }

   @Override
   public boolean login(String username, String password) {
      return acesso.equals(username) && senha.equals(password);
   }

   public void acessarSaldos(String username, String password) {

      if (login(username, password)) {
         for (ContaBancaria conta : contas) {
            System.out.println("----------");
            System.out.println("Nº " + conta.getNumeroConta() + " Titular: " + conta.getTitular() + " Saldo: R$" + String.format("%.2f", conta.getSaldo()));
         }
      } else {
         System.out.println("Acesso negado");
      }
   }
}
