package br.edu.ifsp.bra.ex07;

public class DepositTransaction extends Transaction implements UIDeposit {
  public DepositTransaciton(double b) {
    this.balance = b;
  }
	
  public void execute() {
    double value = this.requestDepositAmount();

    this.balance -= value;
  }

  private double requestDepositAmount() {
    return 19.5;
  }
}
