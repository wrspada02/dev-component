package br.edu.ifsp.bra.ex01;

interface IModem extends IHandleConnection, DataCommunication {}

interface IHandleConnection {
    public void dial(String pno);
    public void hangup();
}

interface DataCommunication {
    public void send(char c);
    public char recv();
}

// é importante quebrar as responsabilidades para que nem todos os métodos 
// sejam obrigatoriamente implementados, visto que, nem sempre é necessário
// Isso também melhora a manutenabilidade futura e facilita a leitura de código
