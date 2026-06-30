package robertovisconti.be_u5_w1_d1.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import robertovisconti.be_u5_w1_d1.enums.StatoTavolo;

@Component
public class Pizzeria implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Pizzeria.class);

    @Autowired
    private Menu menu;

    @Value("${pizzeria.costoCoperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) throws Exception {
        logger.info("\n***** Benvenuti da Nonna Anna *****");
        menu.printMenu();

        Tavolo tavolo3 = new Tavolo(3, 6, StatoTavolo.LIBERO);
        Ordine ordine = new Ordine(1, tavolo3, 3, costoCoperto);

        if (!menu.getPizza().isEmpty()) {
            ordine.addElement(menu.getPizza().get(1));
            ordine.addElement(menu.getPizza().get(2));
        }
        if (!menu.getDrink().isEmpty()) {
            ordine.addElement(menu.getDrink().get(3));
        }
        logger.info("\n ***** Ordine Effettuato ***** \n" + ordine);
    }
}
