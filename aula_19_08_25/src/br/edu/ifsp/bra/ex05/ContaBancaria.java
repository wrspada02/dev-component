package br.edu.ifsp.bra.ex05;

public class ContaBancaria extends ContaBase implements IContaBancaria, IContaPoupanca {
  protected double saldo;

  public ContaBancaria(double saldoInicial) {
    this.saldo = saldoInicial;
  }

  public void sacar(double valor) {
    if (valor > saldo) {
      throw new IllegalArgumentException("Saldo insuficiente");
    }
    saldo -= valor;
  }
}
