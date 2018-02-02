package controller;

import bean.*;
import boundary.*;
import entity.Prenotazione;
import entity.PrenotazioneDao;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public class GestoreRichieste {
    private InterfacciaProfessore prof;
    private List<GestorePrenotazioneConferenza> gestorePrenotazioni;
    private boolean persist=true;
    //diventa false se una prenotazione è null...
    private List<LocalDateTime> dateNonDisponibili;
    //conterra la lista di date non buone per la prenotazione
    public int durataEvento; // x ora è public
    private LocalDateTime dataInizio;

    public GestoreRichieste(InterfacciaProfessore boundary){
        this.prof=boundary;
        this.gestorePrenotazioni=new ArrayList<GestorePrenotazioneConferenza>();
        this.dateNonDisponibili=new ArrayList<>();
    }
    public BeanRisposta gestioneRichieste(BeanCaratteristicheAula beanCaratteristiche,BeanSpecificheConferenza beanInfoTemporali){
        //separare richieste su piu giorni analizzando beanSpecificehConf
        this.dataInizio=beanInfoTemporali.getDataInizio();
        //this.durataEvento=(int)(beanInfoTemporali.getDataFine()-beanInfoTemporali.getDataInizio());//TODO check durata in classe date
        for(int i=0;i<=durataEvento;i++){
            BeanSpecificheConferenza beanTemp=null;
            try {


            beanTemp=beanInfoTemporali.getClone();
            }
            catch (Exception E) {
                E.printStackTrace();
            }
            beanTemp.setDataFine(beanInfoTemporali.getDataInizio().plusDays(i));
            beanTemp.setDataInizio(beanInfoTemporali.getDataInizio().plusDays(i));
            //bean temp rappresenta una suddivisione della richiesta su un giorno solo
            GestorePrenotazioneConferenza gestorePrentTemp=new GestorePrenotazioneConferenza();
            gestorePrenotazioni.add(gestorePrentTemp);
            gestorePrentTemp.ricercaAulaConCaratteristiche(beanCaratteristiche,beanTemp);
            //la chiamata comportera il set del attributo   prenotazione...
            //alla fine delle richiste su tutti i giorni va controllato tale attributo
            //anche se una richiesta di prenotazione fallisce il for deve finire per dare info dettagliate alla boundary

            }

            //tutte le richieste su piu giorni sono state effetuate...
        this.joinPrenotazioni();
        return this.creaRisposta();
        //  la grafica si deve castare il bean di risposta in affermativo o negativo
        // in base al flag contenuto all interno...isValid

    }

    private BeanRisposta creaRisposta() {
        BeanRisposta beanRisposta;
        List<Integer> idAule = new ArrayList<>();
        List<LocalDateTime> date = new ArrayList<>() ;

        if(this.persist) {
            Iterator<GestorePrenotazioneConferenza> i = this.gestorePrenotazioni.iterator();
            while(i.hasNext()) {
                GestorePrenotazioneConferenza p = i.next();
                idAule.add(p.getPrenotazione().getIdAula());
                date.add(p.getPrenotazione().getData());
            }
             beanRisposta = new BeanRispostaAffermativa(idAule,true,date);


        }
        else {
             beanRisposta = new BeanRispostaNegativa(this.dateNonDisponibili,false);
        }
        return beanRisposta;
    }

    private void joinPrenotazioni(){
        Iterator<GestorePrenotazioneConferenza> i=this.gestorePrenotazioni.iterator();
        int j=0;
        while (i.hasNext()){
            GestorePrenotazioneConferenza controllerPren=i.next();
            if (controllerPren.getPrenotazione()==null){
                LocalDateTime dataNonDisponibile=(LocalDateTime)(this.dataInizio.plusDays(j));
                this.dateNonDisponibili.add(dataNonDisponibile);
                this.persist=false;
                //non verra effetuata alcuna persistenza dato che esiste una data non disponibile

            }
            if (persist){
                i=this.gestorePrenotazioni.iterator();

                while(i.hasNext()){
                    GestorePrenotazioneConferenza k = i.next();

                    k.persisti();

                    //manda in persistenza le singole prenotazioni su piu giorni

                }


            }

        }
    }
}
