package br.edu.ifsp.bra.ex07;

public class WithdrawalTransaction extends Transaction implements UIWithdrawal {
  
	
  public void execute() {
    double value = this.requestWithdrawalAmount();

    if (this.balance < value) {
      this.informInsufficientFunds();
    }

    this.balance -= value;
  }

  public double requestWithdrawalAmount() {
    return 19.5;
  }

  public void informInsufficientFunds() {
    throw new UnsupportedOperationException("Saldo insuficiente");
  } 
}
