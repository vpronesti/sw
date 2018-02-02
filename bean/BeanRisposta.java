package bean;
import java.time.LocalDateTime;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public abstract class BeanRisposta {
    private List<LocalDateTime> date;
    private boolean isValid;

    public BeanRisposta(List<LocalDateTime> date, boolean flag) {
        this.setLocalDateTime(date);
        this.setValid(flag);
    }


    public List<LocalDateTime> getLocalDateTime() {
        return date;
    }

    public void setLocalDateTime(List<LocalDateTime> date) {
        this.date = date;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
    @Override
    public String toString(){
        return (this.date.get(0).toString());
     }
}
