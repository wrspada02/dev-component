import br.ifsp.bra.servidor.Pessoa;

public class Aluno extends Pessoa {
    private String ra;

    public Aluno() {}

    public Aluno(String ra) {
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
