package br.com.javainsider.contaBancaria;

public class ContaBancaria {

   private static int   currentNum;
   private       String numeroConta = "00-";
   private       String titular;
   private       double saldo;

   public ContaBancaria(String titular) {
      this.titular = titular;
      numeroConta += ++currentNum;
   }

   public String getNumeroConta() { return numeroConta; }

   public double getSaldo() { return saldo; }

   public String getTitular() { return titular; }
   
   public void depositar(double quantia) {
      if (quantia < 0) {
         System.out.println("Quantias negativas não podem ser depositadas");
         return;
      }
      saldo += quantia;
   }

   public void saque(double quantia) {
      if (quantia > this.saldo) {
         System.out.println("Saldo insuficiente para saque.");
         return;
      }
      this.saldo -= quantia;
   }

   public void transferencia(double quantia, ContaBancaria conta) {

      if (quantia > this.saldo) {
         System.out.println("Saldo insuficiente: R$" + this.getSaldo());
         return;
      } else if (quantia < 0) {
         System.out.println("Não é possível fazer transferências negativas.");
         return;
      }
      this.saldo -= quantia;
      conta.depositar(quantia);
   }
}
