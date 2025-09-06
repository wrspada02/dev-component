package br.edu.ifsp.bra.ex05;

public class Main {
  public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria(1000);
    Pagamentos.pagarConta(conta1, 200);
    
    ContaBancaria conta2 = new ContaPoupanca(1000);
    // Exceção em tempo de execução
    Pagamentos.pagarConta(conta2, 200);
  }
}

//
// este codigo viola o LSP visto que a classe filha ContaPoupanca
// nao respeita o contrato da classe mae ContaBancaria.
// Isso faz com que o a classe filha nao seja substituivel na mae
//
