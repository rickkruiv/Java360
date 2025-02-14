package br.com.javainsider.contaBancaria;

public class AppContaBancaria {

   public static void main(String[] args) {
      
      Banco banco = new Banco();
      banco.criarConta("Joao" );
      banco.criarConta("Pedro");
      banco.criarConta("Luis");

      ContaBancaria contaJoao = banco.buscarConta("00-1");
      contaJoao.depositar(1000);

      ContaBancaria contaPedro = banco.buscarConta("00-2");
      contaPedro.depositar(2000);

      ContaBancaria contaLuis = banco.buscarConta("00-3");
      contaLuis.depositar(2000);
       
      contaPedro.transferencia(500, contaJoao );
      contaLuis.transferencia(500, contaPedro );
      contaJoao.transferencia(500, contaLuis );

      contaJoao.saque(500);

      System.out.println("----------");
      System.out.println("Contas cadastradas");
      for (ContaBancaria conta : Banco.contasCadastradas()) {
         System.out.println("Nº " + conta.getNumeroConta() + " Titular: " + conta.getTitular());
      }

      banco.acessarSaldos("admin", "mudar123");
   }
}
