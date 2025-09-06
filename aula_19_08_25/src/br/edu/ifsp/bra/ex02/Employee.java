import br.edu.ifsp.bra.PersistenceFacade;

public class Employee {
    private PersistenceFacade persistence;

    public Employee(PersistenceFacade p) {
        this.persistence = p;
    }

    public int calculatePay() {
        return 250;
    }

    public void store(String type) {
        this.persistence.store(type);
    }
}
