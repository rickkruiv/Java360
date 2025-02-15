package br.com.javainsider.contaBancaria2;

import java.util.Scanner;

public class BancoMenu {

   private Scanner scan  = new Scanner(System.in);
   static  Banco   banco = new Banco();

   public void iniciarMenu() {

      while (true) {

         System.out.println("----------------------------------");
         System.out.println("[01] - Cadastrar conta............");
         System.out.println("[02] - Acessar conta..............");
         System.out.println("[03] - Contas cadastradas.........");
         System.out.println("[04] - Sair.......................");
         System.out.println("----------------------------------");
         System.out.print("Opção: ");

         int opcao = scan.nextInt();
         scan.nextLine();

         switch (opcao) {
            case 1: cadastrarConta(); break;
            case 2: consultarConta(); break;
            case 3: Banco.printContasCadastradas(); break;
            case 4: return;
            default: continue;
         }
      }
   }

   public void cadastrarConta() {

      System.out.print("Nome titular: ");
      String titular = scan.nextLine();

      System.out.print("Senha: ");
      String senha = scan.nextLine();

      banco.criarConta(titular, senha);
   }

   public void consultarConta() {
      
      System.out.print("Nome titular: ");
      String titular = scan.nextLine();

      System.out.print("Senha: ");
      String senha = scan.nextLine();
      
      ContaBancaria conta = banco.buscarConta(titular, senha);

      if (conta == null) {
         System.out.println("Acesso negado!");
         return;
      }

      conta.printDadosConta();
      menuConta(conta);
   }

   public void menuConta(ContaBancaria conta) {
      
      System.out.println("----------------------------------");
      System.out.println("Deseja fazer alguma ação na conta?");
      System.out.println("[01] - Depositar..................");
      System.out.println("[02] - Sacar......................");
      System.out.println("[03] - Transferir.................");
      System.out.println("----------------------------------");
      System.out.print("Opção: ");

      int opcao = scan.nextInt();
      scan.nextLine();

      switch (opcao) {
         case 1: conta.depositar(); break;
         case 2: conta.saque(); break;
         case 3: conta.transferencia();
         case 4: return;
         default: break;
      }
   }
}
