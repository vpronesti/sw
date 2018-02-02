package entity;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Prenotazione {
    private int idAula;
    private LocalDateTime data;
    private int idPrenotazione;
    private  fasciaOraria fasciaOraria;
    //fascia oraria 0<-->3

    public Prenotazione(int idAula, LocalDateTime data, int idPrenotazione,  fasciaOraria fascia) {
        this.idAula = idAula;
        this.data = data;
        this.idPrenotazione = idPrenotazione;
        this.fasciaOraria = fascia;
    }
    public Prenotazione(int idAula, LocalDateTime data,  fasciaOraria fascia) {
        //costruttore per Oggetti prenotazione senza id (non ancora in strato di persistenza
        this.idAula = idAula;
        this.data = data;
        this.idPrenotazione = -1;
        this.fasciaOraria = fascia;
    }


    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getIdPrenotazione() {
        return idPrenotazione;
    }

    public void setIdPrenotazione(int idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public fasciaOraria getFasciaOraria() {
        return fasciaOraria;
    }

    public void setFasciaOraria(fasciaOraria fasciaOraria) {
        this.fasciaOraria = fasciaOraria;
    }
    //TODO deve essere una enum

}
