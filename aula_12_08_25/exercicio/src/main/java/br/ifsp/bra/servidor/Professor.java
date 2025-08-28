import br.ifsp.bra.servidor.Pessoa;

public class Professor extends Pessoa {
    private String cod;

    public Professor() {}

    public Professor(String cod) {
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}