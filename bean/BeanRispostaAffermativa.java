package bean;

import java.time.LocalDateTime;
import java.util.List;

public class BeanRispostaAffermativa extends BeanRisposta {
    private List<Integer> idAule;
    //private int idPrenotazioni;

    //NB liste di date e id aule devono essere correlate per indice

    public BeanRispostaAffermativa(List<Integer> idAule, boolean flag, List<LocalDateTime> date) {
        super(date, flag);
        this.idAule = idAule;


    }
    public String toString(){
        return this.idAule.get(0).toString();
    }




}
