public abstract class ContaBase {
  protected double saldo;
  
  public ContaBase(double saldoInicial) {
    this.saldo = saldoInicial; 
  }

  public void depositar(double valor) {
    saldo += valor; 
  }

  public double getSaldo() {
    return saldo;
  }
}
