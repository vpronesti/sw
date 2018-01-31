package entity;

import java.util.Date;

public abstract class Prenotazione {
    private int idAula;
    private Date data;
    private int idPrenotazione;
    private FasciaOraria orario;

    /**
     * @return the idAula
     */
    public int getIdAula() {
        return idAula;
    }

    /**
     * @param idAula the idAula to set
     */
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the idPrenotazione
     */
    public int getIdPrenotazione() {
        return idPrenotazione;
    }

    /**
     * @param idPrenotazione the idPrenotazione to set
     */
    public void setIdPrenotazione(int idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    /**
     * @return the orario
     */
    public FasciaOraria getOrario() {
        return orario;
    }

    /**
     * @param orario the orario to set
     */
    public void setOrario(FasciaOraria orario) {
        this.orario = orario;
    }
    
}
