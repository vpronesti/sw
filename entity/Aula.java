package entity;

public abstract class Aula {
    private int numPosti;
    private boolean proiettore;
    private boolean microfono;
    private boolean lavagna;
    private boolean lavagnaInterattiva;
    private boolean preseCorrente;
    private boolean ethernet;
    private String type;

    /**
     * @return the numPosti
     */
    public int getNumPosti() {
        return numPosti;
    }

    /**
     * @param numPosti the numPosti to set
     */
    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }

    /**
     * @return the proiettore
     */
    public boolean isProiettore() {
        return proiettore;
    }

    /**
     * @param proiettore the proiettore to set
     */
    public void setProiettore(boolean proiettore) {
        this.proiettore = proiettore;
    }

    /**
     * @return the microfono
     */
    public boolean isMicrofono() {
        return microfono;
    }

    /**
     * @param microfono the microfono to set
     */
    public void setMicrofono(boolean microfono) {
        this.microfono = microfono;
    }

    /**
     * @return the lavagna
     */
    public boolean isLavagna() {
        return lavagna;
    }

    /**
     * @param lavagna the lavagna to set
     */
    public void setLavagna(boolean lavagna) {
        this.lavagna = lavagna;
    }

    /**
     * @return the lavagnaInterattiva
     */
    public boolean isLavagnaInterattiva() {
        return lavagnaInterattiva;
    }

    /**
     * @param lavagnaInterattiva the lavagnaInterattiva to set
     */
    public void setLavagnaInterattiva(boolean lavagnaInterattiva) {
        this.lavagnaInterattiva = lavagnaInterattiva;
    }

    /**
     * @return the preseCorrente
     */
    public boolean isPreseCorrente() {
        return preseCorrente;
    }

    /**
     * @param preseCorrente the preseCorrente to set
     */
    public void setPreseCorrente(boolean preseCorrente) {
        this.preseCorrente = preseCorrente;
    }

    /**
     * @return the ethernet
     */
    public boolean isEthernet() {
        return ethernet;
    }

    /**
     * @param ethernet the ethernet to set
     */
    public void setEthernet(boolean ethernet) {
        this.ethernet = ethernet;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
}
