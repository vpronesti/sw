package controller;

import bean.BeanCaratteristicheAula;
import bean.BeanSpecificheConferenza;
import entity.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorePrenotazioneConferenza {
    private Prenotazione prenotazione;
    private List<Aula> aule; //manterra riferimenti a aule con caratteristiche (NON TEMPORALI )

    public GestorePrenotazioneConferenza() {

        this.aule = new ArrayList<Aula>();
    }

    //public Aula ricercaAulaConId() { // paramtero id

    //}
    public Prenotazione getPrenotazione(){
        return this.prenotazione;
    }
    public void persisti(){
        //fa persistere in db l'ogg prenotaizone
        PrenotazioneDao prenotazioneDao=new PrenotazioneDao();
        prenotazioneDao.persistiPrenotazione(this.prenotazione);
    }
    public void ricercaAulaConCaratteristiche(BeanCaratteristicheAula beanCarAula, BeanSpecificheConferenza beanSpeConf) {
        aule = AulaDao.getIstance().queryConCaratteristiche(beanCarAula);
        if (!aule.isEmpty()) { //se caratteristiche richiesta hanno prodotto risultati parziali
             this.verificaAulaConCaratteristiche(beanSpeConf);
            //è possibile gestire prenotazioni su piu giorni e piu aule iterando per ogni giorno
            //verificaAUleconCaratteristiche (ottenendo
        }
    }

    //private boolean verificaDisponibilitaId() {



    private void verificaAulaConCaratteristiche(BeanSpecificheConferenza beanSpecificheConferenza) {
        Iterator<Aula> I = this.aule.iterator();
        while(I.hasNext()){
            Aula aula=I.next();
            Prenotazione prenotazione;
            Factory factory=new Factory();
            prenotazione = factory.createPrenotazioni(1,aula.getId(),beanSpecificheConferenza);
            // controller per PrenotazioneAulaConferenza
            //ma funzionale anche con prenotazione didattica vista la unica differenza di un attributo
            PrenotazioneDao prenotazioneDao=new PrenotazioneDao();
            if(prenotazioneDao.queryEsistenzaPrenotazioneConferenza(prenotazione))
            {
                this.prenotazione=prenotazione;
                //prenotazione ok-->setta come attributo
                break;
            }
        }
        return;

    }
}
