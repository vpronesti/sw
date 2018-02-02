package bean;

import java.time.LocalDateTime;
import java.util.List;

public class BeanRispostaNegativa extends BeanRisposta {


    //  date sono la lista di date non disponibili per la prenotazione

    public BeanRispostaNegativa(List<LocalDateTime> date, boolean flag) {
        super(date, flag);


    }




}
