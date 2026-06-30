package robertovisconti.be_u5_w1_d1.entities;

import robertovisconti.be_u5_w1_d1.enums.StatoOrdine;
import robertovisconti.be_u5_w1_d1.enums.StatoTavolo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private List<ElementMenu> prodottiOrdinati = new ArrayList<>();
    private StatoOrdine statoOrdine;
    private int numneroCoperti;
    private LocalTime oraOrdine;
    private double costoCoperto;

    protected Ordine() {
    }

    public Ordine(int numeroOrdine, Tavolo tavolo, int numneroCoperti, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.numneroCoperti = numneroCoperti;
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.oraOrdine = LocalTime.now();
        this.costoCoperto = costoCoperto;
        this.tavolo.setStatoTavolo(StatoTavolo.OCCUPATO);
    }

    public void addElement(ElementMenu elementMenu) {
        this.prodottiOrdinati.add(elementMenu);
    }

    public double getImportoTavolo() {
        double totalElements = 0;
        for (ElementMenu elementMenu : prodottiOrdinati) {
            totalElements += elementMenu.getPrice();
        }
        double totaleCoperti = numneroCoperti * costoCoperto;
        return totalElements + totaleCoperti;
    }

    @Override
    public String toString() {
        return "ORDINE #" + numeroOrdine + " [Tavolo " + tavolo.getNumero() + "]\n" +
                "Stato: " + statoOrdine + " | Coperti: " + numneroCoperti + " | Ora: " + oraOrdine + "\n" +
                "Elementi: " + prodottiOrdinati + "\n" +
                "TOTALE DA PAGARE: " + getImportoTavolo() + "€";
    }

}
