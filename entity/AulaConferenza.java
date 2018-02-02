package entity;

public class AulaConferenza extends Aula {
    public AulaConferenza(int id, int numPosti, boolean proiettore, boolean microfono, boolean lavagna, boolean lavagnaInterattiva, boolean preseCorrente, boolean ethernet, String type) {
        super(id, numPosti, proiettore, microfono, lavagna, lavagnaInterattiva, preseCorrente, ethernet, type);
    }

    public AulaConferenza(int id) {
        super(id);
    }
}
