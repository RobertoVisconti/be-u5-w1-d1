package robertovisconti.be_u5_w1_d1.entities;

import robertovisconti.be_u5_w1_d1.enums.StatoTavolo;

public class Tavolo {
    private int numero;
    private int maxCoperti;
    private StatoTavolo statoTavolo;

    protected Tavolo() {
    }

    public Tavolo(int numero, int maxCoperti, StatoTavolo statoTavolo) {
        this.numero = numero;
        this.maxCoperti = maxCoperti;
        this.statoTavolo = statoTavolo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }


}
