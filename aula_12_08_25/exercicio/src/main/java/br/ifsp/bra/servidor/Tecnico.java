import br.ifsp.bra.servidor.Pessoa;

public class Tecnico extends Pessoa {
    private String profissao;

    public Tecnico(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}