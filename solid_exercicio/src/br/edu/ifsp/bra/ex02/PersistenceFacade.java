package br.edu.ifsp.bra.ex02;

public class PersistenceFacade {
    private Persistence persistence;

    public PersistenceFacade(Persistence p) {
        this.persistence = p;
    }

    public void store(String type) {
        if (type == "img") {
            this.persistence.storeImage();
        } else {
            this.persistence.storeVideo();
        }
    }
}
