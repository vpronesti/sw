package entity;

public abstract class Utente {
    private String nomeUtente;
    private String password;

    /**
     * @return the nomeUtente
     */
    public String getNomeUtente() {
        return nomeUtente;
    }

    /**
     * @param nomeUtente the nomeUtente to set
     */
    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
