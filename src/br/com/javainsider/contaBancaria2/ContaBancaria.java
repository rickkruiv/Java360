package br.com.javainsider.contaBancaria2;

import java.util.Scanner;

public class ContaBancaria {

   private static int    currentNum;
   private        String numeroConta;
   private        String titular;
   private        double saldo;
   private final  String senha;
   private Scanner scan = new Scanner(System.in);

   public ContaBancaria(String titular, String senha) {
      this.titular = titular;
      numeroConta = "00-";
      numeroConta += ++currentNum;
      this.senha = senha;
   }

   public String getNumeroConta() { return numeroConta; }

   public double getSaldo() { return saldo; }

   public String getTitular() { return titular; }
   
   public void depositar() {

      System.out.print("Quantia: R$" );
      double quantia = scan.nextInt();

      if (quantia < 0) {
         System.out.println("Quantias negativas não podem ser depositadas");
         return;
      }
      saldo += quantia;
   }

   public void saque() {

      System.out.print("Quantia: R$" );
      double quantia = scan.nextInt();

      if (quantia > this.saldo) {
         System.out.println("Saldo insuficiente para saque.");
         return;
      }
      this.saldo -= quantia;
   }

   public void transferencia() {

      System.out.print("Quantia: R$" );
      double quantia = scan.nextInt();
      scan.nextLine();

      System.out.println("Nº conta para transferencia: ");
      String contaTransferencia = scan.nextLine();

      for (ContaBancaria conta : Banco.contasCadastradas()) {
         if (conta.getNumeroConta().equals(contaTransferencia)) {
            if (quantia > this.saldo) {
               System.out.println("Saldo insuficiente: R$" + this.getSaldo());
               return;
            } else if (quantia < 0) {
               System.out.println("Não é possível fazer transferências negativas.");
               return;
            }
            this.saldo -= quantia;
            conta.saldo += quantia;
            System.out.println("Transferencia concluida!");
         }
      }      
   }

   public String getSenha() {
      return senha;
   }

   public void printDadosConta() {
      System.out.println( "Titular: "  + getTitular()     );
      System.out.println( "Nº Conta: " + getNumeroConta() );
      System.out.println( "Saldo: R$"  + getSaldo()       );
   }
}
