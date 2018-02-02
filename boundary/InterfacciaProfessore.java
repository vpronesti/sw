package boundary;

import bean.*;
import controller.GestoreLogin;
import controller.GestoreRichieste;
public class InterfacciaProfessore {
    private GestoreRichieste controllerPrenotazioni;
    private boolean isLog = false;
    private GestoreLogin controllerLogin;
    private BeanRisposta beanRisposta;
    private int idProf;
    //TEST
    public static int c=0;

    public InterfacciaProfessore() {



    }


    //private boolean ControlloSintattico() {   }

    public void login() {
        //TEST
        this.isLog=true;
        this.idProf=this.c++;
    }

    public BeanRisposta prenotazioneConId(BeanSpecificheConferenza beanInfo, BeanIdAula beanId) {
        this.controllerPrenotazioni = new GestoreRichieste(this);
        return this.controllerPrenotazioni.gestioneRichieste(beanInfo, beanId);
    }

    public BeanRisposta prenotazioneConCaratteristiche(BeanSpecificheConferenza beanConf, BeanCaratteristicheAula beanCarAula) {


        this.controllerPrenotazioni = new GestoreRichieste(this);
        BeanRisposta beanRisposta = null;
        return this.controllerPrenotazioni.gestioneRichieste(beanCarAula, beanConf);
        //gestisci la risposta inoltrandola alla grafica etc... xD
        /*if(beanRisposta.isValid()) {
            return true;

        }
        else {
            return false;
        }*/


    }

    public BeanRisposta getBeanRisposta() {
        return this.beanRisposta;
    }
}
