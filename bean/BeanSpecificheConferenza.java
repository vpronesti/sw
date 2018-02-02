package bean;
import entity.*;
import java.time.LocalDateTime;

public class BeanSpecificheConferenza implements Cloneable {
    private String titoloConferenza;
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;
    //private enum FasciaOraria fasciaoraria;
    private fasciaOraria fasciaOraria; //TODO scrivere come enum, 4 fascie orarie con interi secondo ordine

    public BeanSpecificheConferenza(String titoloConferenza, LocalDateTime dataInizio, LocalDateTime dataFine, fasciaOraria fasciaOraria) throws Exception{
        this.setTitoloConferenza(titoloConferenza);
        this.setDataInizio(dataInizio);
        this.setDataFine(dataFine);
        this.setFasciaOraria(fasciaOraria);
        //settati attributi
    }

    public String getTitoloConferenza() {
        return titoloConferenza;
    }

    public void setTitoloConferenza(String titoloConferenza) {
        this.titoloConferenza = titoloConferenza;
    }

    public LocalDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public fasciaOraria getFasciaOraria() {
        return fasciaOraria;
    }

    public void setFasciaOraria(fasciaOraria fasciaOraria) throws Exception {
        this.fasciaOraria = fasciaOraria;
    }

    public BeanSpecificheConferenza getClone() throws Exception{
        return (BeanSpecificheConferenza) (this.clone());
        //TODO work?
    }
}
