package br.edu.ifsp.bra.ex05;

public class Pagamentos {
  public static void pagarConta(IContaTransacao conta, double valor) {
    System.out.println("Saldo antes: " + conta.getSaldo());
    conta.sacar(valor);
    System.out.println("Saldo depois: " + conta.getSaldo());
  }
}
