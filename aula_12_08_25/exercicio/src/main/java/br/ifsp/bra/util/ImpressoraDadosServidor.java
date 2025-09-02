package br.ifsp.bra.util;

import br.ifsp.bra.servidor.Aluno;
import br.ifsp.bra.servidor.Professor;
import br.ifsp.bra.servidor.Tecnico;

public class ImpressoraDadosServidor {
    public void imprime(Aluno aluno) {
        System.out.println(
            "Aluno - nome: " + aluno.getNome() + "com RA: " + aluno.getRa()
        );
    }

    public void imprime(Professor professor) {
        System.out.println(
            "Professor - nome: " + professor.getNome() + "com COD: " + professor.getCod()
        );
    }

    public void imprime(Tecnico tecnico) {
        System.out.println(
            "Tecnico - nome: " + tecnico.getNome() + "com profissao: " + tecnico.getProfissao()
        );
    }
}
