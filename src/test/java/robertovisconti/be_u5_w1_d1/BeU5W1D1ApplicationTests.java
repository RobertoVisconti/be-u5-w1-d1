package robertovisconti.be_u5_w1_d1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import robertovisconti.be_u5_w1_d1.entities.*;
import robertovisconti.be_u5_w1_d1.enums.StatoTavolo;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeU5W1D1ApplicationTests {

    @Autowired
    private Menu menu;

    private Tavolo tavolo;

    @Value("${pizzeria.costoCoperto}")
    private double costoCoperto;

    @Test
    void contextLoads() {
    }

    @Test
    @DisplayName("Testo se il menù vieni caricato correttamente")
    public void testCaricamentoMenu() {
        assertNotNull(menu, "Lo scatolone non risulta pieno");
        assertFalse(menu.getPizza().isEmpty(), "Il menu è vuoto");
    }


    @Test
    @DisplayName("Testo se il prezzo dell'oggetto è maggiore di 0.")
    public void testPrezzoPizza() {
        double prezzoPizza = menu.getPizza().get(0).getPrice();
        assertTrue(prezzoPizza > 0);
    }

    @Test
    @DisplayName("Controllo se tutte le pizze hanno un prezzo maggiore di 0 ")
    public void testPrezzoPizze() {
        for (Pizza pizza : menu.getPizza()) {
            assertTrue(pizza.getPrice() > 0, "La pizza " + pizza.getName() + "Ha un prezzo non valido");
        }
    }

    @BeforeEach
    @DisplayName("Creo il tavolo per il test")
    public void setTavolo() {
        this.tavolo = new Tavolo(1, 4, StatoTavolo.LIBERO);
    }

    @Test
    @DisplayName("Test nuovo ordine associato al tavolo")
    public void testOrdine() {
        Ordine ordine = new Ordine(2, tavolo, 2, costoCoperto);
        assertEquals(StatoTavolo.OCCUPATO, tavolo.getStatoTavolo());
    }

    @AfterEach
    @DisplayName("Eseguo la pulizia dopo ogni test")
    public void svuotaTavolo() {
        tavolo = null;
    }


    @Test
    @DisplayName("Calcolo che l'importo totale del tavolo sia corretto")
    public void testImportoTavolo() {
        Ordine ordine = new Ordine(3, tavolo, 2, costoCoperto);

        Pizza p1 = menu.getPizza().get(1);
        Drink d1 = menu.getDrink().get(3);

        ordine.addElement(p1);
        ordine.addElement(d1);

        double totale = ordine.getImportoTavolo();

        double totProdotti = p1.getPrice() + d1.getPrice();
        double totCoperti = 2 * costoCoperto;
        double totOrdine = totCoperti + totProdotti;

        assertEquals(totOrdine, totale, "Il calcolo del tavolo non è corretto");
    }

}
