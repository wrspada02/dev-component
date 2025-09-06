package br.edu.ifsp.bra.ex07;

public class TransferTransaction extends Transaction implements UITransfer {
  public TransferTransaction(double b) {
    this.balance = b;
  } 
 
  public void execute() {
    double value = this.requestTransferAmount();

    this.balance -= value;
  }

  public double requestTransferAmount() {
    return 19.5;
  }
}
