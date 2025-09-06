package br.edu.ifsp.bra.ex07;

public class PayGasBillTransaction extends Transaction implements PayBillUI {
  public PayGasBillTransaction(double b) {
    this.balance = b;
  }  
	
  public void execute() {
    double value = requestBillAmount();

    this.balance -= value;
  }

  public double requestBillAmount() {
    return 19.5;
  }
}
