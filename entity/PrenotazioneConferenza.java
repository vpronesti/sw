package entity;

import java.time.LocalDateTime;

public class PrenotazioneConferenza extends Prenotazione {
    private String titoloConferenza;

    public PrenotazioneConferenza(int idAula, LocalDateTime data, int idPrenotazione,fasciaOraria fasciaOraria, String titoloConferenza) {
        super(idAula, data, idPrenotazione, fasciaOraria);
        this.titoloConferenza = titoloConferenza;
    }



    public PrenotazioneConferenza(int idAula, LocalDateTime data, fasciaOraria fascia, String titoloConferenza) {
    super (idAula,data, fascia);
    this.titoloConferenza=titoloConferenza;
    }
}


