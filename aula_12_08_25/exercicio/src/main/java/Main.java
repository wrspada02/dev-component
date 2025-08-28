import br.ifsp.bra.servidor.Aluno;
import br.ifsp.bra.util.ImpressoraDadosServidor;

public class Main {
    public static void main(String[] args) {
        ImpressoraDadosServidor imp = new ImpressoraDadosServidor();

        imp.imprime(new Aluno("12345"));
    }
}
