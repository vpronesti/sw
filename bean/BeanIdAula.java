package bean;

import java.util.List;

public class BeanIdAula {
    /*
    BeanSpecificheConferenza ha due attributi (DataInizio e DataFine) per 
    gestire la durata dell'evento, siccome le prenotazioni per giorni diversi 
    possono essere in aule diverse in una prenotazione si dovra' tenere 
    conto di un insieme di id, l'ordine della lista e' quello temporale
    */
    private List<Integer> idAule;

    public List<Integer> getIdAule() {
        return idAule;
    }

    public void setIdAule(List<Integer> idAule) {
        this.idAule = idAule;
    }
    
}
