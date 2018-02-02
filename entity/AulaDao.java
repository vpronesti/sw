package entity;


import bean.BeanCaratteristicheAula;

import java.util.ArrayList;
import java.util.List;

public class AulaDao {
    private static AulaDao aulaDao = null;

    //attributi per jdbc
    public static synchronized AulaDao getIstance() {
        if (aulaDao == null)
            return new AulaDao();
        else
            return aulaDao;
        //end singleton pattern :)

        //classe singleto
    }

    public List<Aula> queryConCaratteristiche(BeanCaratteristicheAula beanCarAula) {
        //jdbc sql query
        //istanziare aule da risultato query e ritornarle come vettore
        List<Aula> aule = new ArrayList<Aula>();

        //NB QUESTO E' PER SIMULARE SOLAMENTE
        for (int i = 0; i < 5; i++) {
            Aula aula = new AulaConferenza(i);
            aule.add(aula);

        }
        return aule;
    }
}