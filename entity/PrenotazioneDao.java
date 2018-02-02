package entity;

public class PrenotazioneDao {
    private static PrenotazioneDao prenotazioneDao = null;

    //jdbc attributi
    public void persistiPrenotazione(Prenotazione prenotazione){}
    public static synchronized PrenotazioneDao getIstance() {
        if (prenotazioneDao == null)
            return new PrenotazioneDao();
        else
            return prenotazioneDao;
        //end singleton pattern :)

        //classe singleton
    }

    /*public List<Aula> verificaAule(BeanSpecificheConferenza beanSpeConf) {
        List<Integer> listaAule = new ArrayList<Integer>;
        //jdbc query
        //NB SIMULAZIONE
        for (int i = 3; i < 5; i++) {
            listaAule.add(i);

        }
        return listaAule;


    }
    //obsoleto*/
    public boolean queryEsistenzaPrenotazioneConferenza(Prenotazione prenotazione){       //jdbc
        //TEST INIZIALE
        return true;  }

}
